package ru.job4j.loop;

public class DigitSum {
    public static int sum(int num) {
        int sum = 0; //Дано число, нужно получить сумму его цифр 12 => 1 + 2 => 3
        while (num != 0) {
            sum = sum + (num % 10);
            num /= 10;
        }
        return sum;
    }
}
