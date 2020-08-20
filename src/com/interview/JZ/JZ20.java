package com.interview.JZ;

import java.util.Stack;

public class JZ20 {

    Stack<Integer> stackData = new Stack<>();
    Stack<Integer> stackMin = new Stack<>();

    public void push(int node) {
        stackData.push(node);
        if (stackMin.isEmpty()) {
            stackMin.push(node);
        } else {
            if (node <= stackMin.peek()) {
                stackMin.push(node);
            } else {
                stackMin.push(stackMin.peek());
            }
        }
    }

    public void pop() {
        stackData.pop();
        stackMin.pop();
    }

    public int top() {
        if (stackData.isEmpty())
            throw new RuntimeException("stack is empty!");
        return stackData.peek();
    }

    public int min() {
        if (stackMin.isEmpty())
            throw new RuntimeException("stack is empty!");
        return stackMin.peek();
    }

}
