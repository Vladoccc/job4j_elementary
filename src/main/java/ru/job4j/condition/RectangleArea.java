package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double s = Math.pow(h, 2) * k;
        return s;
    }

    public static void main(String[] args) {
        double s = RectangleArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + s);
        s = RectangleArea.square(8, 3);
        System.out.println(" p = 8, k = 3, s = 3, real = " + s);
        s = RectangleArea.square(8, 8);
        System.out.println(" p = 8, k = 8, s = 1.5802, real = " + s);
    }
}
