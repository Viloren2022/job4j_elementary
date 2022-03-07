package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int first, int second, int third) {
        int tmp = max(third, max(first, second));
        return tmp;
    }

    public static int max(int first, int second, int third, int fourth) {
        int tmp = max(fourth, max(first, second, third));
        return tmp;
    }
}