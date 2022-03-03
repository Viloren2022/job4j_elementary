package ru.job4j.array;

public class DestroySequence {
    public static char[] destroy(char[] seq) {
        String rsl = "";
        for (int i = seq.length - 1; i >= 0; i--) {
            rsl = rsl + seq[i];
        }
        char[] result2 = rsl.toCharArray();
        return result2;
    }
}
