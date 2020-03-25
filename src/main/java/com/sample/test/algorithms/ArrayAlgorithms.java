package com.sample.test.algorithms;

public class ArrayAlgorithms {
    public static int[] removeDuplicates(int[] array) {
        int i = 0;
        for (int j = i + 1; j < array.length; j++) {
            if (array[i] != array[j]) {
                i++;
                array[i] = array[j];
            } else {
                continue;
            }
        }

        int[] array2 = new int[i + 1];
        for (int j = 0; j < array2.length; j++) {
            array2[j] = array[j];
        }
        return array2;
    }

    public static int removeDuplicates(int[] array, int item) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                continue;
            } else {
                array[index] = array[i];
                index++;
            }
        }
        return index;
    }

    public static boolean navigation(int[] array) {
        int farthestIndex = 0;
        for (int i = 0; i <= farthestIndex && farthestIndex <= array.length; i++) {
            farthestIndex = Math.max(farthestIndex, i + array[0]);
        }
        return farthestIndex >= array.length;
    }

    public static int[] multiplication (int[] one, int[] two) {
        int[] result = new int[one.length + two.length];

        for (int i = one.length - 1; i >= 0; i--) {
            for (int j = two.length - 1; j >= 0; j--) {
                result[i + j + 1] = result[i + j + 1] + (one[i] * two[j]);
                result[i + j] = result[i + j] + (result[i + j + 1] / 10);
                result[i + j + 1] =  result[i + j + 1] % 10;
            }
        }
        return result;
    }

    public static int[] addOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int temp = digits[i] + carry;
            digits[i] = (temp) % 10;
            carry = (temp) / 10;
            if (carry == 0) break;
        }
        if (carry > 0) {
            int[] result = new int[digits.length + 1];
            for (int i = 0; i < digits.length; i++) {
                result[i+1] = digits[i];
            }
            result[0] = carry;
            return result;
        }
        return digits;
    }

    public static void arrayPartition4(int[] array) {
        int index = arrangePivot(array, array[0], 0, array.length);
        index = arrangePivot(array, array[index], index, array.length);
        index = arrangePivot(array, array[index], index, array.length);
        index = arrangePivot(array, array[index], index, array.length);
    }

    private static int arrangePivot(int[] array, int pivot, int start, int end) {
        int index = start;
        for (int i = start; i < end; i++) {
            if (array[i] == pivot) {
                swap(array, i, index++);
            }
        }
        return index;
    }

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
