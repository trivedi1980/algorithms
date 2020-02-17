package com.sample.test.algorithms.bitwise;

public class BitwiseAlgorithms {
    public static int countBits(int number) {
        int count = 0;
        while (number != 0) {
            number = number & (number - 1);
            count++;
        }
        return count;
    }

    public static int getParity(int number) {
        return (countBits(number) & 1) == 0 ? 0 : 1;
    }

    public static int swapBits(int number, int i, int j) {
        // first check if ith and jth bit are same or diff
        if (((number >>> i) & 1) != ((number >>> j) & 1)) {
            int mask = (1 << i) | (1 << j);
            number ^= mask;
        }
        return number;
    }
}
