package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmsManagerTestEmpty {

    @Test
    public void testGetLastFilmsEmpty() {
        FilmsManager filmsManager1 = new FilmsManager(0);

        FilmItem[] actual = filmsManager1.getLastFilms(0);
        FilmItem[] expected = new FilmItem[]{};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetIdEmpty() {
        FilmItem filmItemGetId = new FilmItem(0, null, 0);
        int actual = filmItemGetId.getId();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveById (){
        FilmsManager filmsManager1 = new FilmsManager(0);
        FilmItem[] actual = filmsManager1.removeById(6);
        FilmItem[] expected = new FilmItem[]{};
        assertArrayEquals(expected, actual);
    }

}