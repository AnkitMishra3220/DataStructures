package com.ankit.ds.linkedlist;

public class MergeSortedLinkedList {

    public static ListNode mergeTwoSortedLikedList(ListNode head1,ListNode head2){
        ListNode currentNode1 = head1;
        ListNode currentNode2 = head2;

        LinkedList finalLinkedList = new LinkedList();

        while (currentNode1!=null && currentNode2 !=null){

            if(currentNode1.getData() <= currentNode2.getData()){
                finalLinkedList.insertAtEnd(currentNode1.getData());
                currentNode1 = currentNode1.getNext();
            }else {
                finalLinkedList.insertAtEnd(currentNode2.getData());
                currentNode2 = currentNode2.getNext();
            }

        }

        if(currentNode1==null){
            while (currentNode2 !=null){
                finalLinkedList.insertAtEnd(currentNode2.getData());
                currentNode2 = currentNode2.getNext();
            }

        }else {
            while (currentNode1 != null){
                finalLinkedList.insertAtEnd(currentNode1.getData());
                currentNode1 = currentNode1.getNext();
            }

        }
        return finalLinkedList.head;

    }

    public static ListNode mergeTwoSortedListRecusive(ListNode head1,ListNode head2){
        if(head1==null){
          return head2;
        }

        if(head2==null){
            return head1;
        }

        ListNode head;

        if(head1.getData()<=head2.getData()){
            head = head1;
            head1.setNext(mergeTwoSortedListRecusive(head1.getNext(),head2));

        }else{
            head = head2;
            head2.setNext(mergeTwoSortedListRecusive(head1,head2.getNext()));

        }

        return head;

    }

    public static ListNode mergeTwoSortedLinkedListEfficient(ListNode head1,ListNode head2){

        ListNode head = new ListNode(0);
        ListNode sortedNode = head;

        ListNode pointer1 = head1;
        ListNode pointer2 = head2;

        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }

        while (pointer1!=null&&pointer2!=null){

            if(pointer1.getData()<pointer2.getData()){
                sortedNode.setNext(pointer1);
                sortedNode = sortedNode.getNext();
                pointer1 = pointer1.getNext();

            }else {
                sortedNode.setNext(pointer2);
                sortedNode = sortedNode.getNext();
                pointer2 = pointer2.getNext();
            }
        }

        if(pointer1!=null){
            sortedNode.setNext(pointer1);
        }
        if(pointer2!=null){
            sortedNode.setNext(pointer2);
        }

        return head.getNext();

    }

    public static void main(String[] args) throws Exception {

        LinkedList ll1 = new LinkedList();

        ll1.insert(1,0);
        ll1.insert(4,1);
        ll1.insert(6,2);


        LinkedList ll2 = new LinkedList();

        ll2.insert(2,0);
        ll2.insert(3,1);

      //  ListNode newList = mergeTwoSortedLikedList(ll1.head,ll2.head);
        //ListNode newList = mergeTwoSortedListRecusive(ll1.head,ll2.head);
        ListNode newList = mergeTwoSortedLinkedListEfficient(ll1.head, ll2.head);

        ListNode currentNode = newList;
        while (currentNode!=null){
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }
    }
}
