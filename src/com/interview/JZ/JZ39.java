package com.interview.JZ;

public class JZ39 {

    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null)
            return true;
        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right)
                && Math.abs(depth(root.left) - depth(root.right)) <= 1;
    }

    private int depth(TreeNode node){
        if(node == null)
            return 0;
        return Math.max(depth(node.left),depth(node.right)) + 1;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
