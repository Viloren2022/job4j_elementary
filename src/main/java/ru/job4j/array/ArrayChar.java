package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int k = 0; k <= pref.length - 1; k++) {
            if (word[k] != pref[k]) {
                result = false;
            }
        }
        return result;
    }

}

