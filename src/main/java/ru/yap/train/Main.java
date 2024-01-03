package ru.yap.train;

public class Main {
    private final int busTicket = 990;
    private final int airplaneTiket;
    private final int trainTicket;

    public Main() {
        this.airplaneTiket = 3590;
        this.trainTicket = 12000;
    }

    public int getTotalPrice() {
        return busTicket + airplaneTiket + trainTicket;
    }

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println("" + m.getTotalPrice());
    }
}
