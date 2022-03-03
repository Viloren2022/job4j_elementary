package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int pointerLeft = 0;
        int pointerRight = 0;
        for (int i = 0; i < rsl.length; i++) {
            if ((pointerLeft != left.length) && (pointerRight != right.length)) {
                if (left[pointerLeft] < right[pointerRight]) {
                    rsl[i] = left[pointerLeft++];
                } else {
                    rsl[i]  = right[pointerRight++];
                }
            } else if (pointerLeft == left.length) {
                rsl[i]  = right[pointerRight++];
            } else {
                rsl[i] = left[pointerLeft++];
            }
        }
        return rsl;
    }
}
