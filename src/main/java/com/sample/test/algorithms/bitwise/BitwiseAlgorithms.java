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
}
