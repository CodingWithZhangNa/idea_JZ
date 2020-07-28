package com.interview.JZ;

import java.util.Stack;

public class JZ5 {

    public static void main(String[] args) {
        JZ5 sq = new JZ5();
        sq.push(1);
        sq.push(3);
        sq.push(5);
        sq.push(4);

        System.out.println(sq.pop());
        System.out.println(sq.pop());

        sq.push(7);
        System.out.println(sq.pop());

    }

        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        public void push(int node) {
            stack1.push(node);
        }

        public int pop() {
            if(stack2.size() <= 0){
                while(stack1.size() != 0){
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }

}
