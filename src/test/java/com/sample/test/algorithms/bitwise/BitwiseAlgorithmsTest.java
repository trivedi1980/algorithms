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
}
