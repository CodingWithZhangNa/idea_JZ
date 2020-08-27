package com.interview.JZ;

public class JZ6 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        //建立虚拟头结点
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        //基于比较，遍历两个链表
        while (list1 != null && list2 != null){
            if(list1.val < list2.val){
                cur.next = list1;  //cur指向更小的
                cur = cur.next;    //cur起到串联的作用
                list1 = list1.next;  //l1是比较的基准，移动下一个比较基准
            }else{
                cur.next = list2;
                cur = cur.next;
                list2 = list2.next;
            }
        }

        if(list1 != null) cur.next = list1;
        else              cur.next = list2;

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
