package com.sample.test.algorithms;

public class ArrayAlgorithms {
    public static void dutchFlagSeparation2(int[] array, int pivotIndex) {
        int pivot = array[pivotIndex];
        // first pass to move smaller elements before the pivot element
        int smallerIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < pivot) {
                swap(array, smallerIndex, i);
                smallerIndex++;
            }
        }

        // second pass to move larger elements after pivot element
        int largerIndex = array.length - 1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > pivot) {
                swap(array, i, largerIndex);
                largerIndex--;
            }
        }
    }

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
