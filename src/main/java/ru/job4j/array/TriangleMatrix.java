package ru.job4j.array;
import java.util.Arrays;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int num = 1; //переменная счетчик
        for (int i = 0; i < count; i++) { //перебираем внешний массив  до count (кол во строк)
            triangle[i] = new int[i + 1]; //массиву триангл сообщаем что значение првой строки
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = num++;
            }
        }
        return triangle;
    }
}