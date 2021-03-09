package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmsManagerTest {

    FilmsManager filmsManager1 = new FilmsManager(0);

    private FilmItem filmItem1 = new FilmItem(1, "One", 1010);
    private FilmItem filmItem2 = new FilmItem(2, "Two", 0726);
    private FilmItem filmItem3 = new FilmItem(3, "Three", 1810);
    private FilmItem filmItem4 = new FilmItem(4, "Four", 1110);
    private FilmItem filmItem5 = new FilmItem(5, "Fie", 1010);
    private FilmItem filmItem6 = new FilmItem(6, "Six", 1080);
    private FilmItem filmItem7 = new FilmItem(7, "Seven", 1327);
    private FilmItem filmItem8 = new FilmItem(8, "Eight", 1710);
    private FilmItem filmItem9 = new FilmItem(9, "Nine", 1012);
    private FilmItem filmItem10 = new FilmItem(10, "Ten", 1070);
    private FilmItem filmItem11 = new FilmItem(11, "Eleven", 1320);
    private FilmItem filmItem12 = new FilmItem(12, "Twelve", 1871);

    @BeforeEach
    public void setUp() {
        filmsManager1.addFilm(filmItem1);
        filmsManager1.addFilm(filmItem2);
        filmsManager1.addFilm(filmItem3);
        filmsManager1.addFilm(filmItem4);
        filmsManager1.addFilm(filmItem5);
        filmsManager1.addFilm(filmItem6);
        filmsManager1.addFilm(filmItem7);
        filmsManager1.addFilm(filmItem8);
        filmsManager1.addFilm(filmItem9);
        filmsManager1.addFilm(filmItem10);
        filmsManager1.addFilm(filmItem11);
        filmsManager1.addFilm(filmItem12);
    }

    @Test
    public void testGetLastFilmsOneOK() {
        FilmItem[] actual = filmsManager1.getLastFilms(1);
        FilmItem[] expected = new FilmItem[]{filmItem12};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetLastFilms5_OK() {
        FilmItem[] actual = filmsManager1.getLastFilms(5);
        FilmItem[] expected = new FilmItem[]{
                filmItem12, filmItem11, filmItem10, filmItem9, filmItem8
//                filmItem7, filmItem6, filmItem5, filmItem4, filmItem3, filmItem2, filmItem1
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetLastFilmsMoreArrayLength() {
        FilmItem[] actual = filmsManager1.getLastFilms(13);
        FilmItem[] expected = new FilmItem[]{
                filmItem12, filmItem11, filmItem10, filmItem9, filmItem8,
                filmItem7, filmItem6, filmItem5, filmItem4, filmItem3, filmItem2, filmItem1
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetId() {
        FilmItem filmItemGetId = new FilmItem(1, "One", 1010);

        int actual = filmItemGetId.getId();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveById (){
        FilmItem[] actual = filmsManager1.removeById(8);
        FilmItem[] expected = new FilmItem[]{
                filmItem1, filmItem2, filmItem3, filmItem4,
                filmItem5, filmItem6, filmItem7, filmItem9, filmItem10, filmItem11, filmItem12
        };
        assertArrayEquals(expected, actual);
    }


}