package ru.job4j.loop;

public class MultiplicationLoop {
    public static int mult2(int a, int b) {
        int mult = 1;
        for (int i = a; i <= b; i++) {
            mult *= i;
        }
        return mult;
    }
}