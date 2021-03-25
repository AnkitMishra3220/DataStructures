package com.ankit.ds.linkedlist;

public class CircularLinkedList {
    private ListNode tail;
    private int length;

    public ListNode getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public CircularLinkedList(){
        tail=null;
        length=0;
    }
    public void addToHead(int data){
        ListNode temp = new ListNode(data);
        if(tail==null){
            tail=temp;
            tail.setNext(tail);
        }else {
            temp.setNext(tail.getNext());
            tail.setNext(temp);
        }
        length++;

    }

    public void addToTail(int data){
        addToHead(data);
        tail = tail.getNext();
    }

    public void removeFromHead(){
        ListNode temp = tail.getNext();
        if(tail==tail.getNext()){
            tail = null;
        }else {
            tail.setNext(temp.getNext());
            temp = null;
            length--;
        }
    }


    public void removeFromLast(){
        if(tail==tail.getNext()){
            return;
        }
        ListNode temp = tail;
        ListNode head = tail.getNext();
        ListNode currentNode = head;
        while (currentNode.getNext()!=tail){
            currentNode = currentNode.getNext();
        }
        tail = currentNode;
        tail.setNext(head);
        length--;
    }
    public boolean contains(int data){
        if(tail==null){
            return false;
        }
        if(tail.getData()==data){
            return true;
        }
        ListNode currentNode = tail.getNext();
        while (currentNode!=tail){
            if(currentNode.getData()==data){
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    @Override
    public String toString() {
        String result = "[";
        if(tail==null){
            return result + "]";
        }
        ListNode currentNode = tail.getNext();
        while (currentNode!=tail){
            result = result + currentNode.getData() + "-->";
            currentNode = currentNode.getNext();
        }
        return result + tail.getData() + "]";
    }


}
