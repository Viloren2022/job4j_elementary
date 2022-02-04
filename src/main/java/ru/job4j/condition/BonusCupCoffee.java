package ru.job4j.condition;

public class BonusCupCoffee {
    public static int countCup(int count, int n) {
        int rsl;
        rsl = count / n + count;
        return rsl;
    }
}