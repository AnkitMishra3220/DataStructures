package com.ankit.ds.linkedlist;

public class SearchInLinkedList {
    public static int searchLinkedList(ListNode head,int value){
        if(head == null){
            return -1;
        }
        ListNode currentNode = head;
        int position = 0;
        while (head!=null){
            if(currentNode.getData() == value){
                return position;
            }
            currentNode = currentNode.getNext();
            position++;
        }
        return -1;

    }
    public static int searchLinkedListR(ListNode head,int value){
        if(head==null){
            return -1;
        }
        if(head.getData()==value){
            return 0;
        }
        int i = searchLinkedList(head.getNext(),value);
        if(i==-1){
            return -1;
        }else{
            return (i+1);
        }
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
        System.out.println(linkedList);
        System.out.println(searchLinkedList(linkedList.head,9));
        System.out.println(searchLinkedListR(linkedList.head, 5));

    }
}
