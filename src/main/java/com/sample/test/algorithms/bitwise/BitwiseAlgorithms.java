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

    public static int computeProduct(int x, int y) {
        int sum = 0;

        while (x != 0) {
            if ((x & 1) != 0) {
                sum = add(sum, y);
            }
            x = x >>> 1;
            y = y << 1;
        }
        return sum;
    }

    public static int division(int x, int y) {
        int result = 0;
        long power = ((long)1 << 32);
        while (x > y) {
            while (power * y > x) {
                power = (power >>> 1);
            }
            x = x - (int)power  * y;
            result = result + (int)power;
        }
        return result;
    }

    public static int power(int x, int y) {
        int result = 1;
        int power = y;

        while (power != 0) {
            if ((power & 1) != 0) {
                result = result * x;
            }
            power = power >>> 1;
            x = x * x;
        }
        return result;
    }

    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            result = result * 10 + (x % 10);
            x = x/10;
        }
        return result;
    }

    private static int add(int sum, int y) {
        while (y != 0) {
            int carry = sum & y;
            sum = sum ^ y;
            y = carry << 1;
        }
        return sum;
    }
}
