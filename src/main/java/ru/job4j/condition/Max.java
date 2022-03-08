package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;

    }

    public static int max(int first, int second, int third) {
       return max(third, max(first, second));

    }

    public static int max(int first, int second, int third, int fourth) {
        return max(fourth, max(first, second, third));
    }
}