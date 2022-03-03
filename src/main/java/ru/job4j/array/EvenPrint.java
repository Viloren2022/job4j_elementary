package ru.job4j.array;

public class EvenPrint {
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                int temp = array[i];
                array[i] = array[array.length - 1];
                array[array.length - 1] = temp;
                System.out.println(array[i]);
            }
        }
    }
}