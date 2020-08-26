package com.interview.JZ;

public class JZ58 {
    /*
    思路：递归
    1.对于根节点：只要左右的值对称即可；
    2.左右节点的值相等且对称子树对称；
     */
    public boolean isSymmetrical(TreeNode pRoot) {
        if(pRoot == null ) return true;
        return helper(pRoot.left, pRoot.right);
    }

    public boolean helper(TreeNode A, TreeNode B){
        //递归出口
        if(A == null && B == null) return true;
        if(A == null || B == null) return false;

        return A.val == B.val && helper(A.left, B.right) && helper(A.right, B.left);
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
