package com.ankit.ds.linkedlist;

public class CheckEvenOddLinkedList {

    public static String checkEvenOddLinkedList(ListNode head){
        ListNode fastPointer = head;
        while (fastPointer!=null&&fastPointer.getNext()!=null){
            fastPointer = fastPointer.getNext().getNext();
            if(fastPointer==null){
                return "Even";
            }

        }

        return "Odd";
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

        System.out.println(checkEvenOddLinkedList(ll1));
    }
}
