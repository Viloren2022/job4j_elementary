/*
package ru.job4j.array;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {

        int[] rez = new int[left.length + right.length];
        if (left.length == 0 && right.length == 0) {
            return rez;
        } else if (left.length == 0) {
            return right;
        } else if (right.length == 0) {
            return left;
        }
        var tmp = left.concat(right), result = [], value, sum;
        for (var i = 0; i < tmp.length; i++) {
            var value = tmp[i];
            if (result.indexOf(value) == -1) {
                sum = 0;
                if (arr1.indexOf(value) != -1) {
                    sum++;
                }
                if (arr2.indexOf(value) != -1) {
                    sum++;
                }
                if (sum == 1) {
                    result.push(value);
                }
            }
        }
        return result;
    }*/
