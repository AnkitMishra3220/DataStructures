package com.ankit.ds.linkedlist;

public class DLLNode {
    private int data;
    private DLLNode prev;
    private DLLNode next;

    public DLLNode(int data) {
        this.data = data;
    }

    public DLLNode(int data, DLLNode prev, DLLNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public DLLNode getPrev() {
        return prev;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setPrev(DLLNode prev) {
        this.prev = prev;
    }

    public void setNext(DLLNode next) {
        this.next = next;
    }

    public DLLNode getNext() {
        return next;
    }
}
