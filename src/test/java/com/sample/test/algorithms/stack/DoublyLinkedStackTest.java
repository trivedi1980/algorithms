package com.sample.test.algorithms.stack;


import org.junit.Assert;
import org.junit.Test;

public class DoublyLinkedStackTest {

    @Test
    public void testDoublyLinkedStack() {
        DoublyLinkedStack stack = new DoublyLinkedStack();

        // check stack is empty
        Assert.assertEquals(0, stack.getSize());
        Assert.assertEquals(-1, stack.pop());

        // prepare data
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // assert
        Assert.assertEquals(5, stack.pop());
        Assert.assertEquals(5, stack.getSize());

        //insert
        stack.push(6);
        Assert.assertEquals(6, stack.getSize());
        Assert.assertEquals(6, stack.pop());
        Assert.assertEquals(4, stack.pop());
        Assert.assertEquals(3, stack.pop());
        Assert.assertEquals(2, stack.pop());
        Assert.assertEquals(1, stack.pop());
        Assert.assertEquals(0, stack.pop());
        Assert.assertEquals(0, stack.getSize());
    }
}
