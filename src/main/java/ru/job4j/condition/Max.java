package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int first) {
        return max(left, max(right, first));
    }

    public static int max(int left, int right, int first, int second) {
        return max(max(left, max(right, first)), second);
    }

    public static void main(String[] args) {
        int result = Max.max(1, 2);
        System.out.println(result);
        result = Max.max(4, 2);
        System.out.println(result);
        result = Max.max(5, 5);
        System.out.println(result);
        result = Max.max(5, 6, 7);
        System.out.println(result);
        result = Max.max(6, 7, 3, 9);
        System.out.println(result);
    }
}
