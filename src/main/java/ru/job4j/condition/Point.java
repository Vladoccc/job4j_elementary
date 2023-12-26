package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double result = x2 - x1;
        double result1 = y2 - y1;
        double first = Math.pow(result, 2);
        double second = Math.pow(result1, 2);
        double result3 = first + second;
        double result4 = Math.sqrt(result3);
        return result;
    }

    public static void main(String[] args) {
        double result4 = Point.distance(1, 2, 7, 4);
        System.out.println(result4);
    }
}
