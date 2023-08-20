package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmItem;

public class FilmManagerTest {
    FilmManager manager = new FilmManager();
    FilmItem item1 = new FilmItem(11, "Вперёд", 150);
    FilmItem item2 = new FilmItem(22, "Отель Белград", 200);
    FilmItem item3 = new FilmItem(33, "Бладшот", 200);
    FilmItem item4 = new FilmItem(44, "Джентельмены", 150);
    FilmItem item5 = new FilmItem(55, "Человек неведимка", 200);
    FilmItem item6 = new FilmItem(66, "Тролли. Мировой тур", 200);
    FilmItem item7 = new FilmItem(77, "Номер один", 150);

    @Test
    public void addtest() {
        FilmManager manager = new FilmManager();
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);


        FilmItem[] expected = {item1, item2, item3};
        FilmItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLimitLast() {
        FilmManager manager = new FilmManager(4);

        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);

        FilmItem[] expected = {item7, item6, item5, item4};
        FilmItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLessLimitLast() {
        FilmManager manager = new FilmManager(4);

        manager.add(item1);
        manager.add(item2);
        manager.add(item3);


        FilmItem[] expected = {item3, item2, item1};
        FilmItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
