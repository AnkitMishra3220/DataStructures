package com.ankit.ds.linkedlist;

public class AddTwoNumbers {

    public ListNode1 addTwoNumbers(ListNode1 l1, ListNode1 l2) {
        ListNode1 dummyHead = new ListNode1(0);
        ListNode1 p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode1(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode1(carry);
        }
        return dummyHead.next;
    }
}

 class ListNode1 {
     int val;
     ListNode1 next;
     ListNode1() {}
     ListNode1(int val) { this.val = val; }
     ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
}

