package week21;

import week15.ListNode;

public class ReverseLinkedList {

    class Solution {
        public ListNode reverseList(ListNode head) {

            return reverseListNode(head, null);
        }

        public ListNode reverseListNode(ListNode head, ListNode newHead) {
            if(head == null){
                return newHead;
            }

            ListNode next = head.next;
            head.next = newHead;

            return reverseListNode(next, head);

        }
    }

}
