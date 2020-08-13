package com.interview.JZ;

import com.interview.JZ.JZ3.ListNode;

public class JZ15 {

    /*
    使用pre,next指针，pre指向当前cur的前一个，next是当前cur的下一个指针；
    每次改变cur的next为pre，循环递推，直到cur = null ，最后返回pre；
     */

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        JZ15 o = new JZ15();
        System.out.println(o.ReverseList(l1));
    }

    public ListNode ReverseList(ListNode head) {
        ListNode pre = null, cur = head, next;
        while(cur != null){
            next = cur.next;
            cur.next = pre;   //反转
            pre = cur;     //继续下一次
            cur = next;
        }
        return pre;
    }

}
