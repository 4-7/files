package ru.yap.collections;

import java.util.Comparator;

public class PuppyNameComparator implements Comparator<Puppy> {
    @Override
    public int compare(Puppy o1, Puppy o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.name, o2.name);
    }
}
