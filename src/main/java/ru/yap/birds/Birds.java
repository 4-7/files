package ru.yap.birds;

public class Birds {
    public static int numberOfWings = 2;
    public static int count;

    public Birds() {
        count++;
        System.out.println("count = " + count);
    }
}
