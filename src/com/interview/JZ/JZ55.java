package com.interview.JZ;

public class JZ55 {
    /*
    思路：1.两个指针fast、slow，fast一次走两步，slow一次走一步；
         2.如果有环，他们一定会在环内相遇；
         3.当他们相遇后，让fast回到起点，slow不动；
         4.然后两个指针一起走，都是走一步，当他们走到一起的时候，他们的交点就是入环点。
     */
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead == null || pHead.next == null)
            return null;
        ListNode slow = pHead, fast = pHead;
        while (slow.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                fast = pHead;
                while (slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return fast;
            }
        }
        return null;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
