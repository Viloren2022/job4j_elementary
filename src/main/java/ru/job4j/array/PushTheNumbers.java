package ru.job4j.array;

public class PushTheNumbers {
    public static void push(int[][] array, int row, int column) {
        int temp = array[row][column];
        array[row][column] = 0;

        boolean statusUp = false;
        for (int i = 0; i < row; i++) {
            statusUp = true;
            array[i][column] = array[i + 1][column];
        }
        if (statusUp) {
            array[row - 1][column] = temp;
        }

        boolean statusDown = false;
        for (int i = array.length - 1; i > row; i--) {
            statusDown = true;
            array[i][column] = array[i - 1][column];
        }
         if (statusDown) {
             array[row + 1][column] = temp;
         }

        boolean statusRight = false;
        for (int i = array[0].length - 1; i > column; i--) {
            statusRight = true;
            array[row][i] = array[row][i - 1];
        }
        if (statusRight) {
            array[row][column + 1] = temp;
        }

        boolean statusLeft = false;
        for (int i = 0; i < column; i++) {
            statusLeft = true;
            array[row][i] = array[row][i + 1];
        }
        if (statusLeft) {
            array[row][column - 1] = temp;
        }
    }
}