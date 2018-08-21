package com.sample.test.algorithms.stack;

public class ArrayStack {
    private static final int DEFAULT_SIZE = 5;

    private final int initialSize;
    private int[] dataArray;
    private int index;

    public ArrayStack() {
        this.dataArray = new int[DEFAULT_SIZE];
        this.initialSize = DEFAULT_SIZE;
        this.index = -1;
    }

    public ArrayStack(int initialSize) {
        this.dataArray = new int[initialSize];
        this.initialSize = initialSize;
        this.index = -1;
    }

    public boolean push(int data) {
        if ((this.index + 1) >= this.dataArray.length) {
            System.out.println("array is full, resizing the array instance");
            resizeArray();
        }


        this.dataArray[++this.index] = data;
        return true;
    }

    public int pop() {
        if (this.index == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return this.dataArray[this.index--];
    }

    public int getSize() {
        return this.index <= -1 ? 0 : this.index + 1;
    }

    private void resizeArray() {
        int[] origArray = this.dataArray;
        int currentSize = this.dataArray.length;
        int newSize = ((currentSize / this.initialSize)  + 1) * this.initialSize;

        this.dataArray = new int[newSize];
        System.out.println("array resized to " + newSize);
        System.arraycopy(origArray, 0, this.dataArray, 0, currentSize);
    }
}
