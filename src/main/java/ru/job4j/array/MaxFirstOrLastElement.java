package ru.job4j.array;

public class MaxFirstOrLastElement {
    public static int getMaxValue(int[] array) {
        int rsl = Math.max(array[0], array[array.length - 1]);
        return rsl;
    }
}