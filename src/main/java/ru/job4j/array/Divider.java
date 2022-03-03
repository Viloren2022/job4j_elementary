package ru.job4j.array;

public class Divider {
    public static boolean check(int num, int[] ints) {
        int index = 0;
        for (int anInt : ints) {
            if (num % anInt == 0) {
                index++;
            }
        }
        return index == ints.length;
    }
}