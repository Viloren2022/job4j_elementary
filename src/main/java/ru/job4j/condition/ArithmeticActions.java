package ru.job4j.condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        if (rsl == left + right) {
            return "added";
        }
        else if (rsl == left - right) {
            return "subtracted";
        }
        if (rsl == left * right) {
            return "multiplied";
        }
        if (rsl == left / right) {
            return "divided";
        } else {
            return "none";
        }
    }


    public static void main(String[] args) {
        System.out.println(ArithmeticActions.selectAction(5, 10, 15));
    }
}