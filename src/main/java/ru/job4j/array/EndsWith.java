package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int k = 0; k < post.length; k++) {
            if (word[word.length - 1 - k] != post[post.length - 1 - k]) {
                result = false;
                break;
            }
        } return result;
    }
}