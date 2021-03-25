package com.ankit.ds.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class DetectLinkedListLoop {

    public static boolean bruteForce(ListNode head){
        ListNode currentNode = head;
        while (currentNode.getNext()!=null){
            ListNode innerNode = currentNode;
            while (innerNode.getNext()!=null){
                if(currentNode==innerNode.getNext()){
                    return true;
                }
                innerNode = innerNode.getNext();

            }
            currentNode = currentNode.getNext();
        }
        return false;

    }

    public static boolean withHashSet(ListNode head){
        Set<ListNode> setOfNodes = new HashSet<ListNode>();
        ListNode currentNode = head;
        while (currentNode.getNext()!=null){
            if(!setOfNodes.add(currentNode)){
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.addToHead(0);
        circularLinkedList.addToTail(1);
        circularLinkedList.addToTail(2);

        LinkedList linkedList = new LinkedList();
        linkedList.insert(0,0);
        linkedList.insert(1,1);
        linkedList.insert(2,2);

        System.out.println("Linked List:" +linkedList);
        System.out.println("Circular Linked List" +circularLinkedList);

      //  System.out.println(bruteForce(linkedList.head));
      //  System.out.println(bruteForce(circularLinkedList.getTail().getNext()));
        System.out.println(withHashSet(linkedList.head));
        System.out.println(withHashSet(circularLinkedList.getTail().getNext()));

    }
}
