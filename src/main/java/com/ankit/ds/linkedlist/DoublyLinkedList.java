package com.ankit.ds.linkedlist;

public class DoublyLinkedList {
    private DLLNode head;
    private DLLNode tail;
    private int length;

//    public DoublyLinkedList(){
//        head = new DLLNode(Integer.MIN_VALUE,null,null);
//        tail = new DLLNode(Integer.MIN_VALUE,head,null);
//        head.setNext(tail);
//        length=0;
//    }

    public int getLength() {
        return length;
    }


    public int getPosition(int data){
        DLLNode currentNode = head;
        int pos = 0;
        while (currentNode!=null){
            if(currentNode.getData()==data){
                return pos;
            }
            currentNode = currentNode.getNext();
            pos++;
        }
        return Integer.MIN_VALUE;
    }

    public void insertAtBegin(DLLNode dllNode){
        if(head==null){
            head = dllNode;
            tail = dllNode;
            dllNode.setPrev(null);
            dllNode.setNext(null);
            length++;
        }else {
            head.setPrev(dllNode);
            dllNode.setNext(head);
            head = dllNode;
            length++;
        }
    }

    public void insertAtEnd(DLLNode dllNode){
        if(head==null){
            dllNode.setNext(null);
            dllNode.setPrev(null);
            head = dllNode;
            length++;
        }else {
            DLLNode currentNode = head;
            while(currentNode.getNext()!=null){
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(dllNode);
            dllNode.setPrev(currentNode);
            length++;
        }
    }

    public void insert(DLLNode dllNode,int position){
        if(position < 0){
            return;
        }
        if(position==0){
            insertAtBegin(dllNode);
            return;
        }else{
            if(position == length){
                insertAtEnd(dllNode);
                return;
            }
            DLLNode currentNode = head;

            for (int i=0;i<position;i++){
                currentNode = currentNode.getNext();

            }

            DLLNode prevNode = currentNode.getPrev();
            currentNode.setPrev(dllNode);
            dllNode.setNext(currentNode);
            prevNode.setNext(dllNode);
            dllNode.setPrev(prevNode);
            length++;

        }

    }

    @Override
    public String toString() {
        String endChar = "]";
        String result = "[";
        if(head == null){
            return result + endChar;
        }else{
            DLLNode currentNode = head;
            result = result + currentNode.getData();
            currentNode = currentNode.getNext();
            while(currentNode!=null){
                result = result + "<=>" + currentNode.getData();
                currentNode = currentNode.getNext();
            }
            return result + endChar;
        }
    }
}

