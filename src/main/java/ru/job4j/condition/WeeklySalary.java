package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int regular = 10;
        int overpay = 15;
        int sum = 0;
        for (int i = 0; i < hours.length; i++) {
            sum += switch (i) {
                case 0, 1, 2, 3, 4 -> hours[i] > 8 ? (hours[i] - 8) * overpay + 8 * regular : hours[i] * regular;

                case 5, 6 -> hours[i] > 8 ? (((hours[i] - 8) * (overpay * 2)) + 8 * (regular * 2)) : hours[i] * regular * 2;

                default -> 0;
            };
        }
        return sum;
    }
}
