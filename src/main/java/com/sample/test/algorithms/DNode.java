package com.sample.test.algorithms;

public class DNode {
    private DNode next;
    private DNode prev;
    private int data;

    public DNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public DNode getNext() {
        return next;
    }

    public void setNext(DNode next) {
        this.next = next;
    }

    public DNode getPrev() {
        return prev;
    }

    public void setPrev(DNode prev) {
        this.prev = prev;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
