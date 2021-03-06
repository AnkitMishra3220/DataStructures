package com.ankit.ds.linkedlist;

public class DetectLinkedListLoopAndFindNode {

    public static ListNode detectLinkedListLoopAndFindNode(ListNode head){
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (fastPtr!=null && fastPtr.getNext()!=null){
            slowPtr = slowPtr.getNext();
            fastPtr = fastPtr.getNext().getNext();

            if(slowPtr==fastPtr){
                System.out.println("Loop Detected In Linked List");
                slowPtr = head;
                while (fastPtr.getNext()!=null){ ;
                    slowPtr = slowPtr.getNext();
                    fastPtr = fastPtr.getNext();
                    if(slowPtr==fastPtr){
                        return slowPtr;
                    }
                }
            }
        }

        return null;

    }

    public static void main(String[] args) throws Exception {

        ListNode ln1 = new ListNode(0);
        ListNode ln2 = new ListNode(1);
        ListNode ln3 = new ListNode(2);
        ListNode ln4 = new ListNode(3);
        ListNode ln5 = new ListNode(4);
        ListNode ln6 = new ListNode(5);
        ListNode ln7 = new ListNode(6);
        ListNode ln8 = new ListNode(7);
        ListNode ln9 = new ListNode(8);
        ListNode ln10 = new ListNode(9);
        ListNode ln11 = new ListNode(10);
        ListNode ln12 = new ListNode(11);
        ListNode ln13 = new ListNode(12);
        ListNode ln14 = new ListNode(13);

        ln1.setNext(ln2);
        ln2.setNext(ln3);
        ln3.setNext(ln4);
        ln4.setNext(ln5);
        ln5.setNext(ln6);
        ln6.setNext(ln7);
        ln7.setNext(ln8);
        ln8.setNext(ln9);
        ln9.setNext(ln10);
        ln10.setNext(ln11);
        ln11.setNext(ln12);
        ln12.setNext(ln13);
        ln13.setNext(ln14);
        ln14.setNext(ln4);



        try{
            System.out.println(detectLinkedListLoopAndFindNode(ln1).getData());
        } catch (NullPointerException exception){
            System.out.println("Loop is not exist");
        }

        LinkedList linkedList = new LinkedList();
        linkedList.insert(0,0);
        linkedList.insert(1,1);
        linkedList.insert(2,2);
        linkedList.insert(3,3);



        try{
            System.out.println(detectLinkedListLoopAndFindNode(linkedList.head).getData());
        } catch (NullPointerException exception){
            System.out.println("Loop is not exist");
        }



    }
}
