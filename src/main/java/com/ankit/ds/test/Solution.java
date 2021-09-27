package com.ankit.ds.test;

public class Solution {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode currentNode1 = l1;
        ListNode currentNode2 = l2;
        ListNode result = new ListNode();
        ListNode head = result;

        while (currentNode1!=null && currentNode2!=null){
            if(currentNode1.val <= currentNode2.val){
                result.next = new ListNode(currentNode1.val);
                currentNode1 = currentNode1.next;
            }else {
                result.next = new ListNode(currentNode2.val);
                currentNode2 = currentNode2.next;
            }

            result = result.next;
        }

        return head.next;


    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode ll1 = new ListNode(2);
        ListNode ll2 = new ListNode(3);

        l1.next = ll1;
        ll1.next = ll2;

        ListNode l2 = new ListNode(2);
        ListNode lL1 = new ListNode(2);
        ListNode lL2 = new ListNode(3);

        l2.next = lL1;
        lL1.next = lL2;

        ListNode result = mergeTwoLists(l1,l2);

        while (result.next!=null){
            System.out.println("-->" +result.val);
            result = result.next;
        }




    }
}
