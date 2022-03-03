package ru.job4j.array;

public class Sum {
    public static int getSum(int[] array) {
        int rsl = array[0] + array[array.length - 1];
        return rsl;
    }
}