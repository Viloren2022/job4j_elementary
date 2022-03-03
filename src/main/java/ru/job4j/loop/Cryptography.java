package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        StringBuilder word = new StringBuilder(s);
        if (word.length() == 0) {
            return s + "empty";
        }
        for (int i = 0; i < word.length() - 4; i++) {
            if (word.length() < 5) {
                return s;
            } else {
                word.setCharAt(i, '#');
            }
        }
        return word.toString();
    }
}
