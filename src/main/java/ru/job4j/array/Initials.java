package ru.job4j.array;
import java.util.Arrays;

public class Initials {
    public static String convert(String[] fio) {
        String[] strings = Arrays.copyOf(fio, fio.length);
        String name = strings[0] + " " + strings[1].charAt(0) +  "." + strings[2].charAt(0) +  ".";
        return name;
    }
}
