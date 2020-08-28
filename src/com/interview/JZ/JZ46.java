package com.interview.JZ;

public class JZ46 {
    class Node{
        int val;
        Node next;

        Node(int v){
            val = v;
        }
    }

    public int LastRemaining_Solution(int n, int m) {
        if(m == 0 || n == 0)
            return -1;
        //构造环形链表
        Node head = new Node(0);
        Node pre = head;
        for(int i = 1; i < n; i++){
            Node cur = new Node(i);
            pre.next = cur;
            pre = cur;
        }
        pre.next = head;     //环形
        Node tail = pre;
        int cnt = 0;
        while(head != tail){
            if(++cnt == m){
                tail.next = head.next;    //del head
                cnt = 0;
                head = tail.next;
            }else{
                tail = tail.next;        //del tail
                head = tail.next;
            }
        }
        return head.val;
    }
}
