package ru.netology.domain;

public class FilmItem {
    private int id;
    private String filmName;
    private int releaseDate;

    public FilmItem(int id, String filmName, int releaseDate) {
        this.id = id;
        this.filmName = filmName;
        this.releaseDate = releaseDate;
    }

    public int getId() {
        return id;
    }
}

