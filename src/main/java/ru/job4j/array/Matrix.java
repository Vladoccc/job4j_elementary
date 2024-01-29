package ru.job4j.array;

public class Matrix {

    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                int mult = (i + 1) * (j + 1);
                table[i][j] = mult;
            }
        }
        return table;
    }
}
