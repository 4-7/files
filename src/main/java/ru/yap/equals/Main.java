package ru.yap.equals;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        checkEquals();
        findContacts();
    }

    public static void findContacts() {
        ArrayList<Person> persons = new ArrayList<>();
        HashMap<Person, String> contacts = new HashMap<>();
        String firstName = "Стив";
        String lastName = "Джоб";
        String phoneNumber = "8 (988) 123-45-67";
        Person person = new Person(firstName, lastName);
        Person person2 = new Person(firstName, lastName);

        persons.add(person);
        contacts.put(person, phoneNumber);

        System.out.println("person.hashCode()=" + person.hashCode());
        System.out.println("person2.hashCode()=" + person2.hashCode());

        if (persons.contains(new Person(firstName, lastName)))
            System.out.println("Нашли человека");
        else
            System.out.println("Нет таких людей");

        if (contacts.containsKey(person2))
            System.out.println("Нашли телефон");
        else
            System.out.println("Нет телефонов таких людей");

    }

    public static void checkEquals() {
        Book book1 = new Book("First", 1, new String[]{"Me", "He"});
        Book book2 = new Book("Second", 1, new String[]{"Me", "He"});
        System.out.println(book1.equals(book2));
        System.out.println(book1.toString());
    }
}
