package com.ankit.ds.linkedlist;

public class FindMiddleNode {
    public static ListNode getMiddleNode(ListNode head){
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        if(head==null){
            return null;
        }
        if(head.getNext()==null){
            return head;
        }
        while (fastPtr !=null && fastPtr.getNext() !=null){
            slowPtr = slowPtr.getNext();
            fastPtr = fastPtr.getNext().getNext();
        }
        return slowPtr;

    }
    public static void main(String[] args) {

        ListNode ll1 = new ListNode(0);
        ListNode ll2 = new ListNode(1);
        ListNode ll3 = new ListNode(2);
        ListNode ll4 = new ListNode(3);
        ListNode ll5 = new ListNode(4);
        ListNode ll6 = new ListNode(5);

        ll1.setNext(ll2);
        ll2.setNext(ll3);
        ll3.setNext(ll4);
        ll4.setNext(ll5);
        ll5.setNext(ll6);


        System.out.println(getMiddleNode(ll1).getData());




    }
}
