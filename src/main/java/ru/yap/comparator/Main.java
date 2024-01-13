package ru.yap.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Рубашка", 4500, 37));
        items.add(new Item("Носки", 55, 8));
        items.add(new Item("Толстовка", 1399, 74));
        items.add(new Item("Носки", 169, 19));

        System.out.println("До сортировки");
        System.out.println(items);
        ItemPriceComparator itemPriceComparator = new ItemPriceComparator();
        Comparator<Item> reversedItemPriceComparator = itemPriceComparator.reversed();
        items.sort(itemPriceComparator);

        System.out.println("\nПосле сортировки по цене");
        System.out.println(items);

        ItemPopularityComparator itemPopularityComparator = new ItemPopularityComparator();
        items.sort(itemPriceComparator);
        System.out.println("\nПосле сортировки по популярности");
        System.out.println(items);

        ItemStringInSensitiveNameComparator itemStringInSensitiveNameComparator = new ItemStringInSensitiveNameComparator();
        items.sort(itemStringInSensitiveNameComparator);
        System.out.println("\nПосле сортировки по Наименованию");
        System.out.println(items);

    }
}
