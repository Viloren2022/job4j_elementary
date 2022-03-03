package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum++;
            }
        }
        int[] rsl = new int[sum];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (index < rsl.length) {
                    rsl[index++] = array[i][j];
                }
            }
        }
        int n = (int) Math.ceil(Math.sqrt(sum));
        int[][] data = new int[n][n];
        int index2 = 0;
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                if (index2 < rsl.length) {
                    data[j][k] = rsl[index2++];
                }
            }
        }
        return data;
    }
}
/* вносим элементы из одномерного в двумерный массива*/
