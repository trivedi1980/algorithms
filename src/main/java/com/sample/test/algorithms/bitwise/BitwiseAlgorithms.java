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

    public static long swapBits(long number, int i, int j) {
        // first check if ith and jth bit are same or diff
        if (((number >>> i) & 1) != ((number >>> j) & 1)) {
            long mask = (1L << i) | (1L << j);
            number ^= mask;
        }
        return number;
    }

    public static long reverseBits(long number) {
        for (int i = 0; i < (32 >>> 1) ; i++) {
            number = swapBits(number, i, 31 - i);
        }
        return number;
    }

    public static int closestIntegerWithSameWeight(int number) {
        for (int i = 0; i < 32; i++) {
            if (((number >>> i) & 1) != ((number >>> i+1) & 1)) {
                return number ^ ((1 << i) | (1 << i+1));
            }
        }
        return number;
    }

    public static int closestIntegerWithSameWeight2(int number) {
        int sb = (number & ~(number -1));
        int nsb = (~number & (number + 1));
        if (nsb > sb) {
            number = number | nsb;
            number = number ^ (nsb >>> 1);
        } else {
            number = number ^ sb;
            number = number | (sb >>> 1);
        }
        return number;
    }
}
