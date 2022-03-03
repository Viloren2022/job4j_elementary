package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int size = (int) Math.ceil(Math.sqrt(array.length));
        int[][] data = new int[size][size];
        int index = 0;
        for (int j = 0; j < data.length; j++) {
            for (int k = 0; k < data[j].length; k++) {
                if (index < array.length) {
                    data[j][k] = array[index++];
                }
            }
        }
        return data;
    }
}


