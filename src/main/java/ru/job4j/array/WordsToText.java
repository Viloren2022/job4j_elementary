package ru.job4j.array;

import java.util.Arrays;

public class WordsToText {
    public static String convert(String[] words) {
        String result = String.join(" ", words);
        return result;
    }
}
