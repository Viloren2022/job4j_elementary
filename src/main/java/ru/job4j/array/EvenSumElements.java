package ru.job4j.array;

public class EvenSumElements {
    public static boolean checkArray(int[] data) {
        boolean number = false;
        int sum = 0;
        for (int datum : data) {
            sum += datum;
        }
        if (sum % 2 == 0) {
            number = true;
            }
        return number;
    }
}