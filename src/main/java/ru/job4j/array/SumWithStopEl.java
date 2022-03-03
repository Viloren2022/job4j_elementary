package ru.job4j.array;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int sum = 0;
        for (int datum : data) {
            if (datum == el) {
                sum += datum - el;
                break;
            } else {
                sum = sum + datum;
            }
        }
        if (sum % 2 == 0) {
            return sum;
        } else {
            return 0;
        }
    }
}