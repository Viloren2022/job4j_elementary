package ru.job4j.array;

public class ConcatArray {
    public static int combineSize(int[] a, int[] b) {
        int aSize = a.length;
        int bSize = b.length;
        int rsl = aSize + bSize;
        return rsl;
    }
}