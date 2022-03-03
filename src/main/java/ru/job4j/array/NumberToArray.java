package ru.job4j.array;

public class NumberToArray {
    public static int[] resolve(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = count--;
        }
        return arr;
    }
}
