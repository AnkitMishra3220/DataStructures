package com.ankit.ds.linkedlist;

import com.ankit.ds.linkedlist.LinkedList;
import com.ankit.ds.linkedlist.ListNode;

public class LinkedListRecurTrav {

    public static void travReurLL(ListNode head){
        if(head ==null){
            return;
        }
        System.out.println(head.getData());
        travReurLL(head.getNext());
    }

    public static void main(String[] args) throws Exception {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtBegin(1);
        linkedList.insert(2,1);
        linkedList.insert(3,2);
        linkedList.insert(4,3);
        linkedList.insert(5,4);
        linkedList.insert(6,5);
        linkedList.insert(7,6);
        linkedList.insert(8,7);
        linkedList.insert(9,8);
        linkedList.insert(10,9);
        travReurLL(linkedList.getHead());

      //  System.out.println(linkedList);

    }
}
