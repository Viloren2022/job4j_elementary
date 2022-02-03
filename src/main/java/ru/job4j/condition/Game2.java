package ru.job4j.condition;

public class Game2 {
    public static int checkGame(double percent, int prize, int pay) {
        double rslt = 0;
        if (percent * prize > pay) {
            rslt = percent * prize - pay;
        }
        if (percent * prize < pay) {
            rslt = 0;
        }
        return (int) rslt;
    }

    public static void main(String[] args) {
        System.out.println(Game2.checkGame(0.2, 50, 9));
        System.out.println(Game2.checkGame(0.9, 1, 2));
    }
}