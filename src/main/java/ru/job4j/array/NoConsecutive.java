package ru.job4j.array;

public class NoConsecutive {
    public static int find(int[] data) {
        int result = -1;
        for (int i = 0; i < data.length; i++) {
            if ((data[i] + data[i]) == data[++i]) {
                return result;
            } else {
                return data[i];
            }
        }
        return result;
    }
}