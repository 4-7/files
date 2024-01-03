package ru.yap.equals;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    String title;
    int pages;
    String[] authors;

    public Book(String title, int pages, String[] authors) {
        this.title = title;
        this.pages = pages;
        this.authors = authors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages && Objects.equals(title, book.title) && Arrays.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(title, pages);
        result = 31 * result + Arrays.hashCode(authors);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", authors=" + Arrays.toString(authors) +
                '}';
    }
}
