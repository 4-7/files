package ru.yap.generic;

import java.util.List;

public class Printer<T extends List<Number>> {
    private final T list;

    public Printer(T list) {
        this.list = list;
    }

    public void print() {
        for (int i = 0; i < list.size(); i++) {
            double price = list.get(i).doubleValue() / 100;
            System.out.println("Цена товара: " + price + " руб.");
        }
    }
}
