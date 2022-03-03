package ru.job4j.loop;

public class DegreeLoop {
    public static int calculate(int a, int n) {
        int degree = 1;
        for (; n > 0; n--) {
            degree = degree * a;
        }
        return degree;
    }
}