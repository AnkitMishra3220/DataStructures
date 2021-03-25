package com.ankit.ds.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class FindNodeFromEnd {

    public static ListNode getNodeFromEnd(ListNode head,int n){
        int length = 0;
        if(head == null){
            return null;
        }
        ListNode currentNode = head;
        while (currentNode != null){
            length ++;
            currentNode = currentNode.getNext();
        }
        ListNode temp = head;
        for(int i=1;i< length-n+1;i++){
            temp = temp.getNext();
        }
        return temp;
    }
    static int i = 1;
    public static void printNthFromLast(ListNode head, int n)
    {
        if (head == null){
           return ;
        }
        printNthFromLast(head.getNext(), n);
        int j = head.getData();
        if (i == n){
            System.out.print(head.getData());
        }
        i= i+1;

    }

    public static void printFromLastHashMap(ListNode head,int n){

        Map<Integer,ListNode> mapOfListNode = new HashMap<Integer,ListNode>();
        if(head == null){
            System.out.println("Empty Linked List");
        }else {
            ListNode currentNode = head;
            int i = 1;
            while (currentNode.getNext()!=null){
                mapOfListNode.put(i,currentNode);
                currentNode = currentNode.getNext();
                i++;
            }
            System.out.println(mapOfListNode.get(i-n+1).getData());
        }

    }

    public static void printFromLastTwoPointer(ListNode head,int n){
        if(head==null){
            System.out.println("Empty Linked List");
        }
        ListNode firstPointer = head;
        ListNode secondPointer = head;

        for(int i=1;i<n;i++){
            firstPointer = firstPointer.getNext();
        }

        while (firstPointer.getNext()!=null){
            firstPointer = firstPointer.getNext();
            secondPointer = secondPointer.getNext();
        }

        System.out.println(secondPointer.getData());

    }


    public static void main(String[] args) throws Exception {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtBegin(new ListNode(1));
        linkedList.insert(2,1);
        linkedList.insert(3,2);
        linkedList.insert(4,3);
        linkedList.insert(5,4);
        System.out.println(linkedList);
        printFromLastHashMap(linkedList.head,2);
        printFromLastTwoPointer(linkedList.head,1);

//        System.out.println(getNodeFromEnd(linkedList.head,3).getData());
//        printNthFromLast(linkedList.head,3);




    }



}
