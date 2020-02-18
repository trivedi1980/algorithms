package com.sample.test.algorithms.bitwise;

import org.junit.Assert;
import org.junit.Test;

public class BitwiseAlgorithmsTest {
    @Test
    public void testCountBits() {
        Assert.assertEquals(1, BitwiseAlgorithms.countBits(2));
        Assert.assertEquals(2, BitwiseAlgorithms.countBits(3));
        Assert.assertEquals(2, BitwiseAlgorithms.countBits(10));
    }

    @Test
    public void testParity() {
        Assert.assertEquals(1, BitwiseAlgorithms.getParity(2));
        Assert.assertEquals(0, BitwiseAlgorithms.getParity(10));
        Assert.assertEquals(1, BitwiseAlgorithms.getParity(11));
    }

    @Test
    public void testSwapBits() {
        Assert.assertEquals(3, BitwiseAlgorithms.swapBits(9, 1, 3));
        Assert.assertEquals(9, BitwiseAlgorithms.swapBits(9, 0, 3));
    }

    @Test
    public void testInverseBits() {
        Assert.assertEquals(964176192, BitwiseAlgorithms.reverseBits(43261596));
        Assert.assertEquals(3221225471L, BitwiseAlgorithms.reverseBits(4294967293L));
    }

    @Test
    public void testClosestWeight() {
        Assert.assertEquals(5, BitwiseAlgorithms.closestIntegerWithSameWeight(6));
        Assert.assertEquals(11, BitwiseAlgorithms.closestIntegerWithSameWeight(7));
    }

    @Test
    public void testClosestWeight2() {
        Assert.assertEquals(5, BitwiseAlgorithms.closestIntegerWithSameWeight2(6));
        Assert.assertEquals(11, BitwiseAlgorithms.closestIntegerWithSameWeight2(7));
    }
}
