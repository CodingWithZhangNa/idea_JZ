package com.interview.JZ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class JZ60 {

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        /*
        * 两种数据结构：Queue + ArrayList
        * 核心方案：queue中取出一个元素，再把其左右孩子加入queue
        * */

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(pRoot == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);

        while(!queue.isEmpty()){
            int n = queue.size();      //一定要先获得，防止fast fail
            ArrayList<Integer> temp = new ArrayList<>();

            for(int i = 0; i < n; i++){
                TreeNode cur = queue.remove();   //queue中取出一个节点
                temp.add(cur.val);               //再把节点值加入list
                if(cur.left != null)             //左孩子不空，加入queue
                    queue.add(cur.left);
                if(cur.right != null)
                    queue.add(cur.right);
            }
            res.add(temp);
        }
        return res;
    }

    public class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int x) {
            val = x;
        }
    }

}
