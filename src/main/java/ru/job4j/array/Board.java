package ru.job4j.array;

public class Board {
    public static int getCountRow(int[][] array) {
        int rsl = array.length;
        return rsl;
    }

    public static int getCountCellInRow(int[][] array, int row) {
        int rsl = array[row].length;
        return rsl;
    }
}