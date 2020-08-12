package com.interview.JZ.JZ14;

public class JZ14_Code {

        public static void main(String[] args) {
            ListNode l1 = new ListNode(1);
            ListNode l2 = new ListNode(2);
            ListNode l3 = new ListNode(3);
            l1.next = l2;
            l2.next = l3;
            ListNode tmpnode = FindKthToTail(l1,2);
            System.out.println(tmpnode.val);
        }

        public static ListNode FindKthToTail(ListNode head, int k) {

            //设置两个指针一开始都指向head；
            //让第一个指针 fi 先走 k - 1 步，然后两个指针再一起走，当 fi 走到链表尾的时候，se 刚好来到倒数k的位置。
            if(head == null || k == 0)   //特判
                return null;
            ListNode fi = head;
            ListNode se = head;
            for(int i = 1; i <= k-1; i++){   // fi先走 k-1 步
                fi = fi.next;
            }
            if(fi == null)   // k > len 特判
                return null;
            while (fi.next != null){
                fi = fi.next;
                se = se.next;
            }
            return se;

        }


}
