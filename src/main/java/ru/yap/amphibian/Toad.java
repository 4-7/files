package ru.yap.amphibian;

public class Toad extends Amphibian {
    protected Toad() {
        super("Коричневая");
    }

    @Override
    public void move() {
        System.out.println("Я важно шагаю по просторам!");
    }
}
