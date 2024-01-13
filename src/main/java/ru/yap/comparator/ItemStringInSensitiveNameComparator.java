package ru.yap.comparator;

import java.util.Comparator;

public class ItemStringInSensitiveNameComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.name, o2.name);
    }
}
