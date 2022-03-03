package ru.job4j.array;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int[] copyData = new int[0];
        int massCount = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j == sum) {
                    data[i][j] = 0;
                } else {
                    copyData = Arrays.copyOf(copyData, ++massCount);
                    copyData[massCount - 1] = data[i][j];
                }
            }
        }
        return copyData;
    }
}