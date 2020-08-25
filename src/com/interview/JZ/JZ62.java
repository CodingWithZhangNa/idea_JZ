package com.interview.JZ;

import java.util.ArrayList;
import java.util.List;

public class JZ62 {

    public int KthNode(TreeNode pRoot, int k){
        List<Integer> list = inorder(pRoot, new ArrayList<>());
        return list.get( list.size() - k );
    }

    public List<Integer> inorder(TreeNode root, List<Integer> list){
        if(root == null) return list;

        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);

        return list;
    }


    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

}
