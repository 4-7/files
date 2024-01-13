package ru.yap.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<String> emptyList = Collections.emptyList();
        final List<String> singletonList = Collections.singletonList("Привет, мир!");
        final List<String> nCopiesList = Collections.nCopies(5, "Java");

        System.out.println("emptyList = " + emptyList);
        System.out.println("singletonList = " + singletonList);
        System.out.println("nCopiesList = " + nCopiesList);

        List<Long> listOfLongs = new ArrayList<>();
        listOfLongs.add(157478403L);
        listOfLongs.add(2450033L);
        listOfLongs.add(32039458858604L);

        System.out.println("listOfLongs = " + listOfLongs);

        Collections.fill(listOfLongs, 5555555L);
        System.out.println("listOfLongs = " + listOfLongs);
        System.out.println("\n");

        List<Long> listOfSmallLongs = new ArrayList<>();
        listOfSmallLongs.add(1L);
        listOfSmallLongs.add(2L);
        listOfSmallLongs.add(3L);

        List<Long> listOfBigLongs = new ArrayList<>();
        listOfBigLongs.add(1000000000L);
        listOfBigLongs.add(2000000000L);
        listOfBigLongs.add(3000000000L);

        System.out.println("listOfSmallLongs = " + listOfSmallLongs);
        System.out.println("listOfBigLongs = " + listOfBigLongs);
        System.out.println("\n");

        Collections.copy(listOfSmallLongs, listOfBigLongs);
        System.out.println("listOfSmallLongs = " + listOfSmallLongs);
        System.out.println("listOfBigLongs = " + listOfBigLongs);
        System.out.println("\n");

        List<String> fruits = new ArrayList<>();
        fruits.add("Банан");
        fruits.add("Апельсин");
        fruits.add("Яблоко");
        fruits.add("Груша");

        System.out.println("fruits = " + fruits);
        fruits.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("fruits = " + fruits);
    }
}
