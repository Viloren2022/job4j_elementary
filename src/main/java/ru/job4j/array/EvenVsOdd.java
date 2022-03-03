package ru.job4j.array;

public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int rsl1 = 1, rsl2 = 2, rsl3 = 0;
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                sum1 += players[i];
            } else {
                sum2 += players[i];
            }
        }
        if (sum1 > sum2) {
            return rsl1;
        } else if (sum2 > sum1) {
            return rsl2;
        } else {
            return rsl3;
        }
    }
}
