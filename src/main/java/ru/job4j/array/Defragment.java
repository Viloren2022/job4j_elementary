package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int nullIndex = index;
                for (int i = nullIndex + 1; i < array.length; i++) {
                    if (array[i] != null) {
                    int notUll = i;
                    swap(array, nullIndex, notUll);
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

