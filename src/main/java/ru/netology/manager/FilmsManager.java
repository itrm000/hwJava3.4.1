package ru.netology.manager;

import ru.netology.domain.FilmItem;

public class FilmsManager {
    private FilmItem[] items;  // инициализируем массив из объектов класса FilmItem

    //  конструктор
    public FilmsManager(int itmesTuOutput) { // (количество объектов для выведения)
        // длина массива куда будем перекладывать последние фильмы
        items = new FilmItem[itmesTuOutput];  // переменная [items] = новый массив из объектов класса (FilmItem)
    }

    //  вывод последних 10 фильмов
    public FilmItem[] getLastFilms(int numberLastFilms) { // (количество последних фильмов)
        if (this.items.length < numberLastFilms) {
            numberLastFilms = this.items.length;
        }
        FilmItem[] arrOutput = new FilmItem[numberLastFilms]; // новый массив - куда будем перекладывать

        int exitIdx = this.items.length - numberLastFilms; //индекс выхода = длина массива - количество последних фильмов
        int indexArrOutput = 0; // индекс - куда записываем
        int upperBound = items.length - 1; // индекс - откуда записываем
        for (int i = this.items.length - 1; i >= exitIdx; i--) {
            arrOutput[indexArrOutput] = this.items[upperBound];
            indexArrOutput++;
            upperBound--;
        }
        return arrOutput;
    }

    public void addFilm(FilmItem item) {
        // создаём новый массив размером на единицу больше
        int length = items.length + 1;
        FilmItem[] tmp = new FilmItem[length];

        // копируем поэлементно
        System.arraycopy(items, 0, tmp, 0, items.length);
        // for (int i = 0; i < items.length; i++) {tmp[i] = items[i];}

        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

//    //  удаление элемента - наивная релизация
    public FilmItem[] removeById(int id){
        int length1 = 0;
        if (items.length == 0){
            length1 = 0;
        } else {
            length1 = items.length - 1;
        }
        FilmItem[] tmp = new FilmItem[length1];
        int index = 0;
        for (FilmItem item : items) {
            if (item.getId() != id){
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
        return tmp;
    }

}
