package ru.job4j.array;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int i = 0;
        int[] rsl = new int[left.length + right.length];
        for (int l : left) {
            rsl[i++] = l;
        }

        for (int k = 0; k < right.length; k++) {
            int r = right[k];
            boolean exist = false;
            for (int j = 0; j < rsl.length; j++) {
                int m = rsl[j];
                if (m == r) {
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                rsl[i++] = r;
            }

        }
        return Arrays.copyOf(rsl, i);
    }
}


