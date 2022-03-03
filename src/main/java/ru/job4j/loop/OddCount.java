package ru.job4j.loop;

public class OddCount {
    public static int count(int a, int b) {
        int sum = 0;
        for (int i = a; b >= i; i++) {
            if (i % 2 == 1) {
                sum = sum + 1;
            }
        } return sum;
    }
}