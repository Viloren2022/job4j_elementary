package ru.job4j.array;

public class Decoding {
    public static int[] decode(int[] ints, int number) {
        int[] rsl = new int[ints.length];
        int index = 0;
        for (int i = 0; i < ints.length; i++) {
            rsl[index++] = ints[i] % number;
        }
        return rsl;
    }
}