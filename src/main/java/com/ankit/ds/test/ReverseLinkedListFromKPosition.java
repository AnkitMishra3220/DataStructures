package com.ankit.ds.test;

public class ReverseLinkedListFromKPosition {

    public static ListNode reverseLinkedListFromKPosition(ListNode listNode,int k){
        int i = 1;
        ListNode head = listNode;

        while (listNode.next!=null){
            listNode = listNode.next;
            i++;
            if(i==k){
                break;
            }
        }
        ListNode reverseList = reverse(listNode.next);

        listNode.next = reverseList;

        return head;



    }

    public static ListNode reverse(ListNode listNode){
        ListNode current = listNode;
        ListNode prevNode = null;

        while (current!=null){
            ListNode next = current.next;
            current.next = prevNode;
            prevNode = current;
            current = next;
        }

        return prevNode;
    }


    public static ListNode reverse1(ListNode listNode){
        ListNode prev = null;
        while (listNode!=null){
            ListNode next = listNode.next;
            listNode.next = prev;
            prev = listNode;
            listNode = next;
        }
        return prev;
    }

    public static void main(String[] args) {

        ListNode ll1 = new ListNode(1);
        ListNode ll2 = new ListNode(2);
        ListNode ll3 = new ListNode(3);
        ListNode ll4 = new ListNode(4);
        ListNode ll5 = new ListNode(5);
        ListNode ll6 = new ListNode(6);
        ListNode ll7 = new ListNode(7);
        ListNode ll8 = new ListNode(8);

       ll1.next = ll2;
       ll2.next = ll3;
       ll3.next = ll4;
       ll4.next = ll5;
       ll5.next = ll6;
       ll6.next = ll7;
       ll7.next = ll8;

       //ListNode out = reverseLinkedListFromKPosition(ll1,3);
       ListNode out = reverse1(ll1);

        while (out!=null){
            System.out.println(out.val);
            out = out.next;
        }

    }
}
