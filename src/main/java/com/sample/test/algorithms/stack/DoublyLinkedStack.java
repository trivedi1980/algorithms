package com.sample.test.algorithms.stack;

import com.sample.test.algorithms.DNode;

public class DoublyLinkedStack {
    private DNode head;
    private DNode tail;
    private int size;

    public DoublyLinkedStack() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean push(int data) {
        DNode node = new DNode(data);

        if (this.head == null) {
            this.head = node;
        }

        if (this.tail != null) {
            this.tail.setNext(node);
            node.setPrev(this.tail);
        }

        this.tail = node;
        this.size++;
        return true;
    }

    public int pop() {
        if (this.size <= 0) return -1;

        DNode item;
        if (this.head == this.tail) {
            item = this.head;
            this.head = null;
            this.tail = null;
        } else {
            item = this.tail;
            this.tail = item.getPrev();
            this.tail.setNext(null);
        }
        this.size--;

        return item != null ? item.getData() : -1;
    }

    public int getSize() {
        return this.size;
    }
}
