package ru.yap.wolf;

class Wolf {
    public static void behaviorIfMeetHuman() {
        System.out.println("Грозно рычать.");
    }
}

class Dog extends Wolf {
    public static void behaviorIfMeetHuman() {
        System.out.println("Радостно вилять хвостом.");
    }

    public static class Main {
        public static void main(String[] args) {
            Wolf dog = new Dog();
            dog.behaviorIfMeetHuman();
        }
    }
}
