package com.ankit.ds.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class TwoLinkedListMergeNode {

    public static ListNode getTwoLinkedListMergeNodeByHashing(ListNode head1,ListNode head2){

        Set<ListNode> setOfListNode = new HashSet<ListNode>();
        ListNode currentNode1 = head1;

        while (currentNode1!=null){
            setOfListNode.add(currentNode1);
            currentNode1 = currentNode1.getNext();
        }

        ListNode currentNode2 = head2;

        while (currentNode2!=null){
            if(!setOfListNode.add(currentNode2)){
                return currentNode2;
            }
            currentNode2 = currentNode2.getNext();
        }
        return null;
    }

    public static ListNode getIntersectingNode(ListNode head1,ListNode head2){

        int length1=0;
        int length2=0;
        int difference=0;
        ListNode currentNode1 = head1;
        ListNode currentNode2 = head2;

        while (currentNode1!=null){
            length1++;
            currentNode1 = currentNode1.getNext();
        }

        while (currentNode2!=null){
            length2++;
            currentNode2 = currentNode2.getNext();
        }

        if(length1<length2){
            currentNode1=head2;
            currentNode2=head1;
            difference = length2-length1;
        }else {
            currentNode1 =head1;
            currentNode2=head2;
            difference=length1-length2;
        }

        for (int i=0;i<difference;i++){
            head1 = head1.getNext();
        }
        while (head1!=null&&head2!=null){
            if(head1==head2){
                return head1;
            }
            head1 = head1.getNext();
            head2 = head2.getNext();
        }
        return null;

    }

    public static void main(String[] args) {

        ListNode firstListNode1 = new ListNode(0);
        ListNode firstListNode2 = new ListNode(1);
        ListNode firstListNode3 = new ListNode(2);
        ListNode firstListNode4 = new ListNode(3);
        ListNode firstListNode5 = new ListNode(4);

        ListNode secondListNode1 = new ListNode(1);
        ListNode secondListNode2 = new ListNode(2);
        ListNode secondListNode3 = new ListNode(3);
        ListNode secondListNode4 = new ListNode(4);
        ListNode secondListNode5 = new ListNode(5);
        ListNode secondListNode6 = new ListNode(6);
        ListNode secondListNode7 = new ListNode(7);

        firstListNode1.setNext(firstListNode2);
        firstListNode2.setNext(firstListNode3);
        firstListNode3.setNext(firstListNode4);
        firstListNode4.setNext(firstListNode5);

        secondListNode1.setNext(secondListNode2);
        secondListNode2.setNext(secondListNode3);
        secondListNode3.setNext(secondListNode4);
        secondListNode4.setNext(secondListNode5);
        secondListNode5.setNext(secondListNode6);
        secondListNode6.setNext(secondListNode7);

        firstListNode5.setNext(secondListNode5);

        System.out.println(getTwoLinkedListMergeNodeByHashing(firstListNode1,secondListNode1).getData());
        System.out.println(getIntersectingNode(firstListNode1,secondListNode1).getData());







    }
}
