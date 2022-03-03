package ru.job4j.array;

public class Validator {
    public static boolean checkArray(int[] data, int value) {
        int count = 0;
        boolean rsl = true;
        for (int datum : data) {
            if (datum == value) {
                count++;
            }
        }
        if (count >= data.length / 2) {
            rsl = false;
        }
        return rsl;
    }
}