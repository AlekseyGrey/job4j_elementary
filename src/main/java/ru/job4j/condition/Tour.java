package ru.job4j.condition;

public class Tour {
    public static void offer(boolean passport) {
        System.out.println("У клиента есть загранпаспорт : " + passport);
        if (passport) {
            System.out.println("Туры за границу.");
        } else {
            System.out.println("Туры по России.");
        }
    }

    public static void main(String[] args) {
        Tour.offer(true);
        Tour.offer(false);
    }
}
