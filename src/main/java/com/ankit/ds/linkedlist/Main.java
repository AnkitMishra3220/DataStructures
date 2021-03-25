package com.ankit.ds.linkedlist;

public class Main {
    public static void main(String[] args) throws Exception {
//          ListNode head = new ListNode(1);
//          ListNode headNext1 = new ListNode(2);
//          ListNode headNext2 = new ListNode(3);
//          ListNode headNext3 = new ListNode(5);
//          ListNode headNext4 = new ListNode(6);
//          ListNode headNext5 = new ListNode(8);
////        head.setNext(headNext1);
////        headNext1.setNext(headNext2);
////        System.out.println("Length --> " +length(head));
////        display(head);
////        displayRecussive(head);
//
//        LinkedList linkedList = new LinkedList();
//        linkedList.insertAtBegin(head);
////        linkedList.insertAtBegin(headNext1);
////        linkedList.insertAtBegin(headNext2);
//        linkedList.insertAtEnd(headNext1);
//        linkedList.insertAtEnd(headNext2);
//        linkedList.insertAtEnd(headNext3);
//        linkedList.insertAtEnd(headNext4);
//        linkedList.insertAtEnd(headNext5);
//        System.out.println(linkedList.getLength());
//        linkedList.insert(4,3);
//        linkedList.insert(7,6);
//        linkedList.removeFromEnd();
//        linkedList.removeFromBegin();
//        linkedList.remove(5);
//        linkedList.display(linkedList);
//        System.out.println(linkedList);
//        DLLNode dllNode1 = new DLLNode(1);
//        DLLNode dllNode2 = new DLLNode(2);
//        DLLNode dllNode3 = new DLLNode(3);
//
//        dllNode1.setPrev(null);
//        dllNode1.setNext(dllNode2);
//        dllNode2.setPrev(dllNode1);
//        dllNode2.setNext(dllNode3);
//        dllNode3.setPrev(dllNode2);
//        dllNode3.setNext(null);
//
//        displayDLL(dllNode1);

//        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
//
//        doublyLinkedList.insertAtBegin(new DLLNode(0));
//        doublyLinkedList.insert(new DLLNode(1),1);
//        doublyLinkedList.insert(new DLLNode(2),2);
//        doublyLinkedList.insertAtEnd(new DLLNode(4));
//        doublyLinkedList.insert(new DLLNode(3),3);
//
//        System.out.println(doublyLinkedList);

        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.addToHead(0);
       circularLinkedList.addToTail(1);
       circularLinkedList.addToTail(2);
       //circularLinkedList.removeFromHead();
       // circularLinkedList.removeFromLast();
        System.out.println(circularLinkedList);





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

    public static void displayDLL(DLLNode head){
        DLLNode currentNode = head;
        while (currentNode!=null){
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
