package ru.yap.comparator;

import java.util.Comparator;

public class ItemPopularityComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return o1.popularity - o2.popularity;
    }
}
