package ru.job4j.array;

public class PositiveOrNegative {
    public static boolean check(int[] data) {
        boolean status =  false;
        int countNeg = 0;
        int countPos = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < 0) {
                countNeg++;
            } else {
                countPos++;
            }
        }
        if (countNeg % 2 != 0) {
            status = true;
        }
        if (countPos % 2 == 0) {
            status = false;
        }
        return status;
    }
}