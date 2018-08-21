package com.sample.test.algorithms.stack;

import org.junit.Assert;
import org.junit.Test;

public class ArrayStackTest {

    @Test
    public void testArrayStackWithDefaultConstructor() {
        ArrayStack arrayStack = new ArrayStack();

        // check stack is empty
        Assert.assertEquals(-1, arrayStack.pop());

        // prepare
        arrayStack.push(0);
        arrayStack.push(1);
        arrayStack.push(2);

        // assert
        Assert.assertEquals(2, arrayStack.pop());
        Assert.assertEquals(1, arrayStack.pop());
        Assert.assertEquals(0, arrayStack.pop());
        Assert.assertEquals(-1, arrayStack.pop());

        // prepare for array resize
        arrayStack.push(0);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);

        // assert size
        Assert.assertEquals(5, arrayStack.getSize());

        arrayStack.push(5);
        Assert.assertEquals(6, arrayStack.getSize());

        arrayStack.push(6);
        arrayStack.push(7);
        arrayStack.push(8);
        arrayStack.push(9);
        Assert.assertEquals(10, arrayStack.getSize());
    }

    @Test
    public void testArrayStackWithConstructor() {
        ArrayStack arrayStack = new ArrayStack(3);

        // check stack is empty
        Assert.assertEquals(-1, arrayStack.pop());

        // prepare
        arrayStack.push(0);
        arrayStack.push(1);
        arrayStack.push(2);

        // assert
        Assert.assertEquals(2, arrayStack.pop());
        Assert.assertEquals(1, arrayStack.pop());
        Assert.assertEquals(0, arrayStack.pop());
        Assert.assertEquals(-1, arrayStack.pop());

        // prepare for array resize
        arrayStack.push(0);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);

        // assert size
        Assert.assertEquals(5, arrayStack.getSize());

        arrayStack.push(5);
        Assert.assertEquals(6, arrayStack.getSize());

        arrayStack.push(6);
        arrayStack.push(7);
        arrayStack.push(8);
        arrayStack.push(9);
        Assert.assertEquals(10, arrayStack.getSize());
    }
}
