package ru.job4j.array;

import java.util.Arrays;

public class Transposition {
    public static int[][] convert(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

  /*  public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] result = new int[m][n];
        String arrayToString = Arrays.toString(result);
        System.out.println(arrayToString);
    }*/
}
