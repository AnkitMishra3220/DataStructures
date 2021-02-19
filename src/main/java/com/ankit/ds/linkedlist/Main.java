package com.ankit.ds.linkedlist;

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode headNext1 = new ListNode(2);
        ListNode headNext2 = new ListNode(3);
        head.setNext(headNext1);
        headNext1.setNext(headNext2);
        System.out.println("Length --> " +length(head));
        display(head);
        displayRecussive(head);
    }

    public static int length(ListNode headNode){
        int length = 0;
        ListNode currentNode = headNode;
        while (currentNode != null){
            length ++;
            currentNode = currentNode.getNext();
        }
        return length;
    }

    public static void display(ListNode headNode){
        //O(n) Time Complexity and O(1) Auxilary Space
        ListNode currentNode = headNode;
        while (currentNode != null){
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }
    }

    public static void displayRecussive(ListNode head){
        //O(n) Time Complexity and O(n) Auxiliary Space O(1)
        ListNode currentNode = head;
        if(currentNode == null){
            return;
        } else {
            System.out.println(currentNode.getData());
            currentNode = head.getNext();
            displayRecussive(currentNode);
        }

    }
}
