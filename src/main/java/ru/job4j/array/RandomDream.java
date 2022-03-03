package ru.job4j.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        String rsl = "";
        for (int i = 0; i < num; i++) {
            if (num % 4 == 0) {
                rsl = prizes[prizes.length - 1];
            } else if (num > prizes.length) {
                num = num % prizes.length;
                rsl = prizes[i];
            } else {
                rsl = prizes[i];
            }
        }
        return rsl;
    }
}

