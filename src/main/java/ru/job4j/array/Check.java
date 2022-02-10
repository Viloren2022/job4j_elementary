package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        for (int k = 0; k < data.length; k++) {
            if (data[0] != data[k]) {
                return false;
            }
        }
        return true;
    }
}
