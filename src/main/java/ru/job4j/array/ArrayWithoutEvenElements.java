package ru.job4j.array;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int[] copyData = new int[0];
        int count = 0;
        for (int datum : data) {
            if (datum % 2 != 0) {
                copyData = Arrays.copyOf(copyData, ++count);
                copyData[count - 1] = datum;
            }
        }
        return copyData;
    }
}