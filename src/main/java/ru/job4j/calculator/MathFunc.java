package ru.job4j.calculator;

public class MathFunc {
    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int func2(int x) {
        int y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
        int rslt1 = MathFunc.func1(3);
        int rslt2 = MathFunc.func2(5);
        int rslt3 = MathFunc.func1(100);
        int total = rslt1 + rslt2 + rslt3;
        System.out.println(total);
    }
}


