package com.sample.test.algorithms.stack;

import com.sample.test.algorithms.Node;

public class LinkedStack {
    private Node head;
    private Node tail;
    private int size;

    public LinkedStack() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean push(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        }

        if (this.tail != null) {
            this.tail.setNext(newNode);
        }
        this.tail = newNode;
        this.size++;
        return true;
    }

    public int pop() {

        if (this.size <= 0) return -1;

        Node item;
        if (this.head == this.tail) {
            item = this.head;
            this.head = null;
            this.tail = null;
        } else {
            item = this.tail;
            this.tail = getTailPredecessor();
            this.tail.setNext(null);
        }

        this.size--;
        return item == null ? -1 : item.getData();
    }

    public int getSize() {
        return this.size;
    }

    private Node getTailPredecessor() {
        Node predecessor = this.head;
        while(predecessor.getNext() != this.tail) {
            predecessor = predecessor.getNext();
        }
        return predecessor;
    }
}
