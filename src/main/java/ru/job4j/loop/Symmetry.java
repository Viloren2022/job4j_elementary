package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        boolean rsl = true;
        String str = Integer.toString(i);
        for (int j = 0; j < str.length() / 2; j++) {
           if (str.charAt(j) != str.charAt(str.length() - 1 - j)) {
               rsl = false;
               break;
           }
        }
        return rsl;
    }
}
