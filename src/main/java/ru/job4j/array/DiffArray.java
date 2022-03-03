package ru.job4j.array;

import java.util.Arrays;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        int k = 0;
        int[] rez = new int[left.length];
        if (left.length == 0) {
            return rez;
        }

        for (int j = left.length - 1; j >= 0; j--) {
            int value = left[j];
            boolean status = true;
            for (int i : right) {
                if (value == i) {
                    status = false;
                    break;
                }
            }
            if (status) {
                rez[k++] = value;
            }
        }
        return Arrays.copyOf(rez, k);
    }
}

