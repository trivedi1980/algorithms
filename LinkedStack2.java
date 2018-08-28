package com.sample.test.algorithms.stack;

import com.sample.test.algorithms.Node;

public class LinkedStack2 {
    private Node head;
    private int size;

    public LinkedStack2() {
        this.head = null;
        this.size = 0;
    }

    public boolean push(int data) {
        this.head = new Node(data, head);
        this.size++;
        return true;
    }

    public int pop() {
        if (this.head == null) return -1;

        int data = this.head.getData();
        this.head = this.head.getNext();
        this.size--;
        return data;
    }

    public int getSize() {
        return this.size;
    }
}
