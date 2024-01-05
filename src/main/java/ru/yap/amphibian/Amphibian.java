package ru.yap.amphibian;

public abstract class Amphibian {
    String color;

    protected Amphibian(String color) {
        this.color = color;
    }

    public void eat() {
        System.out.println("Ем насекомых");
    }

    public abstract void move();

    public String getColor() {
        return color;
    }
}
