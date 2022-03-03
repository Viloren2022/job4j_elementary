package ru.job4j.loop;

public class Hamming {
    public static int checkStrings(String left, String right) {
        int i = 0;
        int count = 0;
        while (i < left.length()) {
            if (left.charAt(i) != right.charAt(i)) {
                count++;
            }
            i++;
        }
    return count;
    }
}