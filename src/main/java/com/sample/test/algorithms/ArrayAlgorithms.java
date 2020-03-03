package com.sample.test.algorithms;

public class ArrayAlgorithms {
    public static void arrangeOddEven(int[] array) {
        int evenIndex = 0;
        int oddIndex = array.length - 1;

        while (evenIndex <= oddIndex) {
            if (array[evenIndex] % 2 == 0) {
                evenIndex++;
            } else {
                swap(array, evenIndex, oddIndex--);
            }
        }
    }

    private static void swap(int[] array, int i1, int i2) {
        int temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
    }
}
