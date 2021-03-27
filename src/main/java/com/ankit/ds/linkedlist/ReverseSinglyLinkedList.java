package com.ankit.ds.linkedlist;

public class ReverseSinglyLinkedList {

    public static ListNode reverseLinkedList(ListNode head) {
        ListNode previousNode = null;
        ListNode nextNode = null;
        ListNode currentNode = head;
        while (currentNode != null) {
            nextNode = currentNode.getNext();
            currentNode.setNext(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;


        }

        return previousNode;

    }

    public static void main(String[] args) throws Exception {
        LinkedList ll = new LinkedList();
        ll.insert(0, 0);
        ll.insert(1, 1);
        ll.insert(2, 2);
        ll.insert(3, 3);

        ListNode reverseHead = reverseLinkedList(ll.head);

        //System.out.println(reverseHead.getData());

        ListNode currentNode = reverseHead;

        while (currentNode!=null){
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }

    }
}
