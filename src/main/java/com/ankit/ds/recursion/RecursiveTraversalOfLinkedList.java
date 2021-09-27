package com.ankit.ds.recursion;

 class ListNode<T> {
     T data;
     ListNode next;

     ListNode(T data){
         this.data = data;
     }
}

public class RecursiveTraversalOfLinkedList {

     public static void traverseLinkedList(ListNode listNode){
         if(listNode == null){
             return;
         }


         traverseLinkedList(listNode.next);
         System.out.println(listNode.data);


     }

    public static void main(String[] args) {

        ListNode listNode1 = new ListNode("Ankit");
        ListNode listNode2 = new ListNode("Atul");
        ListNode listNode3 = new ListNode("Arun");
        ListNode listNode4 = new ListNode("Ankita");
        ListNode listNode5 = new ListNode("Ayushi");
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        traverseLinkedList(listNode1);




    }
}
