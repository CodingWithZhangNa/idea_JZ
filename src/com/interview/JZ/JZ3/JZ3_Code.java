package com.interview.JZ.JZ3;

import java.util.ArrayList;
import java.util.Stack;

public class JZ3_Code {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        JZ3_Code s = new JZ3_Code();
        System.out.println(s.printListFromTailToHead(l1));
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        //栈具有先进后出的特点，在遍历链表时将值按顺序放入栈中，最后出栈的顺序即为逆序。
        Stack<Integer> stack = new Stack<>();
        while (listNode != null){
            stack.add(listNode.val);
            listNode = listNode.next;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        while (!stack.isEmpty()){
            ans.add(stack.pop());
        }

        return ans;
    }

}
