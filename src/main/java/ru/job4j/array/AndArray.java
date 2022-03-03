package ru.job4j.array;

import java.util.Arrays;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int index = 0;
        for (int k : left) {
            for (int i : right) {
                if (k == i) {
                    index++;
                    break;
                }
            }
        }
        int[] rsl = new int[index];
        int index2 = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    rsl[index2++] = left[i];
                    break;
                }
            }
        }
        return rsl;
    }
}
