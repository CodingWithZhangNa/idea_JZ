package com.interview.JZ;

public class JZ36 {
    //思路：当访问链表A的指针访问到链表尾部时，令它从链表B的头部重新开始访问链表B；
    // 同样地，当访问链表B的指针访问到链表尾部时，令它从链表A的头部重新开始访问链表A；
    //这样就能控制访问A和B两个链表的指针能同时访问到交点。
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode a = pHead1;
        ListNode b = pHead2;

        while (a != b){
            if(a == null) a = pHead2;
            else          a = a.next;

            if(b == null) b = pHead1;
            else          b = b.next;
        }
        return a;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

}
