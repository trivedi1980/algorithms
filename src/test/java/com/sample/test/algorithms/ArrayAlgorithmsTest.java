package com.sample.test.algorithms;

import com.sample.test.algorithms.bitwise.BitwiseAlgorithms;
import org.junit.Assert;
import org.junit.Test;

public class ArrayAlgorithmsTest {
    @Test
    public void testOddEvenArrange() {
        int[] array = new int[] { 1, 2, 4, 5, 0};
        ArrayAlgorithms.arrangeOddEven(array);
        Assert.assertEquals(0, array[0]);
        Assert.assertEquals(2, array[1]);
        Assert.assertEquals(4, array[2]);
        Assert.assertEquals(5, array[3]);
        Assert.assertEquals(1, array[4]);
    }

    @Test
    public void testDutchFlagSeparation2() {
        int[] array = new int[] { 1, 2, 4, 5, 2, 0};
        ArrayAlgorithms.dutchFlagSeparation2(array, 1);
        Assert.assertEquals(1, array[0]);
        Assert.assertEquals(0, array[1]);
        Assert.assertEquals(2, array[2]);
        Assert.assertEquals(2, array[3]);
        Assert.assertEquals(4, array[4]);
        Assert.assertEquals(5, array[5]);
    }
}
