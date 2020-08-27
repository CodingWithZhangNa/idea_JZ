package com.interview.JZ;

import java.util.HashMap;

public class JZ25 {
    public RandomListNode Clone(RandomListNode pHead)
    {
        HashMap<RandomListNode,RandomListNode> map = new HashMap<>();
        RandomListNode cur = pHead;

        //第一次遍历，存label
        while (cur != null){
            map.put(cur,new RandomListNode(cur.label));
            cur = cur.next;
        }

        //第二次遍历，处理指向关系
        cur = pHead;
        while (cur != null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }

        return map.get(pHead);
    }

    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
    
}
