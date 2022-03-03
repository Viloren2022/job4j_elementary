package ru.job4j.array;

public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
        int[] array = new int[data.length];
        int index = 0;
        for (int i = data.length - 1; i >= 0; i--) {
            array[index++] = data[index][i];
            index++;
        }
        return array;
    }
}

