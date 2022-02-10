package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int index = 0; index <= (array.length - 1) / 2; index++) {
            int time = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = time;
        }
        return array;
    }
}
