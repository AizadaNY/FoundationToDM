package week21;

import week15.ListNode;

public class RemoveNthNode {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode slow = head, fast = head;

        for(int i = 0; i < n; i++){
            fast = fast.next;
        }

        if(fast == null){
            return head.next;
        }

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}
