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

    @Test
    public void testFourPartitions() {
        int[] array = new int[] {1,2,3,4,1,2,3,4,1,2,3,4};
        ArrayAlgorithms.arrayPartition4(array);
        Assert.assertEquals(1, array[0]);
        Assert.assertEquals(1, array[1]);
        Assert.assertEquals(1, array[2]);
    }

    @Test
    public void testAddOne() {
        int[] array = new int[] { 9 };
        array = ArrayAlgorithms.addOne(array);
    }

    @Test
    public void testMultiplication() {
        int[] one = new int[] {1, 3};
        int[] two = new int[] { 6 };
        int[] result = ArrayAlgorithms.multiplication(one, two);
    }

    @Test
    public void testNavigation() {
        int[] one = new int[] {3, 3, 1, 0, 2, 0, 1};
        Assert.assertTrue(ArrayAlgorithms.navigation(one));
    }

    @Test
    public void testDuplicateRemove() {
        int[] array = new int[] { 2, 2, 3, 5, 5, 5, 7, 7, 8 };
        int[] result = ArrayAlgorithms.removeDuplicates(array);
        Assert.assertEquals(2, result[0]);
        Assert.assertEquals(3, result[1]);
        Assert.assertEquals(5, result[2]);
        Assert.assertEquals(7, result[3]);
        Assert.assertEquals(8, result[4]);
    }

    @Test
    public void testDuplicateRemove2() {
        int[] array = new int[] { 2, 3, 5, 5, 5, 7, 7, 8 };
        int[] result = ArrayAlgorithms.removeDuplicates(array);
        Assert.assertEquals(2, result[0]);
        Assert.assertEquals(3, result[1]);
        Assert.assertEquals(5, result[2]);
        Assert.assertEquals(7, result[3]);
        Assert.assertEquals(8, result[4]);
    }

    @Test
    public void testDuplicateRemove3() {
        int[] array = new int[] { 2, 3, 5, 5, 5, 7, 7, 8 };
        int result = ArrayAlgorithms.removeDuplicates(array, 5);
        Assert.assertEquals(2, array[0]);
        Assert.assertEquals(3, array[1]);
        Assert.assertEquals(7, array[2]);
        Assert.assertEquals(7, array[3]);
        Assert.assertEquals(8, array[4]);
        Assert.assertEquals(5, result);
    }
}
