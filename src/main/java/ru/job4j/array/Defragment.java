package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int nullIndex = index;
                for (int i = nullIndex + 1; i < array.length; i++) {
                    if (array[i] != null) {
                    int notUll = i;
                    array[index] = array[i];
                    array[i] = null;
                    break;
                    }
                }
            }
        }
        return array;
    }

    public static String[] swap(String[] array, int source, int dest) {
        String time = array[source];
        array[source] = array[dest];
        array[dest] = time;
        return array;
    }
}

