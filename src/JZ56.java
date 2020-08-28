public class JZ56 {
    public ListNode deleteDuplication(ListNode pHead)
    {
        ListNode dummy = new ListNode(0);
        dummy.next = pHead;

        ListNode cur = pHead;
        ListNode pre = dummy;

        while(cur != null){
            while(cur.next != null && cur.val == cur.next.val){
                cur = cur.next;
            }
            cur = cur.next;

            if(pre.next.next == cur)  pre = pre.next;
            else                      pre.next = cur;
        }
        return dummy.next;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
