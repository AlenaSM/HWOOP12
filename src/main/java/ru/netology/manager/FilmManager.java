package ru.netology.manager;

import ru.netology.domain.FilmItem;

public class FilmManager {
    private FilmItem[] items = new FilmItem[0];
    private int limitLast = 5;

    public FilmManager() {

    }

    public FilmManager(int limitLast) {
        this.limitLast = limitLast;
    }

    public void add(FilmItem item) {
        FilmItem[] tmp = new FilmItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public FilmItem[] findAll() {
        return items;
    }

    public FilmItem[] findLast() {
        int resultLength;
        if (items.length < limitLast) {
            resultLength = items.length;
        } else {
            resultLength = limitLast;
        }
        FilmItem[] tmp = new FilmItem[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = items[items.length - 1 - i];
        }
        return tmp;
    }
}
