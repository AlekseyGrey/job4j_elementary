package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point.distance(6, 1, 12, 5);
        System.out.printf("result (6, 1) to (12, 5) %.2f\n", result2);
        double result3 = Point.distance(10, 5, 5, 5);
        System.out.printf("result (6, 1) to (12, 5) %.2f", result3);
    }
}
