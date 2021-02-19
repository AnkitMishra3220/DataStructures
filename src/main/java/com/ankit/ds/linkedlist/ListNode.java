package com.ankit.ds.linkedlist;

public class ListNode {
    private int data;
    private ListNode next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getNext() {
        return next;
    }

    public ListNode(int data) {
        this.data = data;
    }
}
