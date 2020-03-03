package com.sample.test.algorithms;

public class ArrayAlgorithms {
    public static void dutchFlagSeparation(int[] array, int pivotIndex) {
        // first pass to move smaller elements to before the pivot element
        int pivot = array[pivotIndex];

        boolean swapDone = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < pivot) {
                    swap(array, i, j);
                    swapDone = true;
                    break;
                }
            }
            if (!swapDone) break;
        }

        swapDone = false;
        // second pass to move larger elements after the pivot element
        for (int i = array.length - 1; i >= 0; i--) {
            for(int j = i - 1; j >=0; j--) {
                if (array[j] > pivot) {
                    swap(array, i, j);
                    swapDone = true;
                    break;
                }
            }
            if (!swapDone) break;
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
