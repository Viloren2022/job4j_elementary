package ru.job4j;

public class Main {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 0; i < 10; i++) {
            k = k++;
        }
        System.out.println(k);
    }
}