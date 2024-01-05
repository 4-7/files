package ru.yap.amphibian;

public class Frog extends Amphibian {
    protected Frog() {
        super("Зеленая");
    }

    @Override
    public void move() {
        System.out.println("Я скакаю аки северный олень!");
    }
}
