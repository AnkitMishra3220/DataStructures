package com.ankit.ds.linkedlist;

public class LinkedList {
    private int length = 0;
    ListNode head;
    public int getLength() {
        return length;
    }

    public synchronized ListNode getHead(){
        return head;
    }

    public synchronized void insertAtBegin(int data){
        ListNode listNode = new ListNode(data);
            listNode.setNext(head);
            head = listNode;
            length++;
    }

    public synchronized void insertAtEnd(int data){
        ListNode listNode = new ListNode(data);

        if(head == null){
            head = listNode;
            length++;
            return;
        }

        if(head.getNext()==null){
            head.setNext(listNode);
            length++;
            return;
        }

        ListNode currentNode = head;

        while (currentNode.getNext()!=null){
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(listNode);
        length++;

    }

    public synchronized void insert(int data,int position) {
        if(position < 0 || position > length){
            System.out.println("Invalid Position");
        }
        ListNode listNode = new ListNode(data);
        if(position == 0){
            insertAtBegin(listNode.getData());
            return;
        }
        if(position == length+1){
            insertAtEnd(listNode.getData());
            return;
        }
        ListNode currentNode = head;
        for (int i=0;i<position;i++){
            if(i==position-1){
                listNode.setNext(currentNode.getNext());
                currentNode.setNext(listNode);
            }
            currentNode = currentNode.getNext();

        }
        length++;
    }

    public synchronized void removeFromBegin(){
        ListNode listNode = head;
        if(listNode != null){
            head = listNode.getNext();
            listNode.setNext(null);
        }
    }

    public synchronized void removeFromEnd(){
        if(head == null){
            return;
        }
        ListNode currentNode = head;
        while (currentNode.getNext() != null){
            if(currentNode.getNext().getNext() == null){
                currentNode.setNext(null);
                return;
            }else {
                currentNode = currentNode.getNext();
            }

        }
    }

    public synchronized void remove(int position){
        ListNode currentNode = head;
        for(int i=0;i<position;i++){
            if(i==position-1){
                ListNode nextToNextNode = currentNode.getNext().getNext();
                currentNode.getNext().setNext(null);
                currentNode.setNext(nextToNextNode);
            }
           currentNode = currentNode.getNext();
        }

    }

    @Override
    public String toString() {
        String endChar = "]";
        String result = "[";
        if(head == null){
            return result + endChar;
        }else{
            ListNode currentNode = head;
            result += currentNode.getData();
            currentNode = currentNode.getNext();
            while (currentNode != null){
                result = result + "," + currentNode.getData();
                currentNode = currentNode.getNext();
            }
            return result + "]";
        }

    }

    public synchronized void display(LinkedList linkedList){
        ListNode currNode = linkedList.head;
        if(currNode == null){
            System.out.println("Linked List is Empty");
        }
        while (currNode != null){
            System.out.println(currNode.getData());
            currNode = currNode.getNext();
        }

    }



}
