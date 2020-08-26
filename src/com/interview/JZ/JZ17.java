package com.interview.JZ;

public class JZ17 {
    /*
    题目思路：（树的特点决定，优先考虑递归；其次考虑深度优先搜索）；
            1.当前树结构相同：当前节点值相同、左子树结构相同、右子树结构相同；
            2.左子树当中有相同；
            3.右子树当中有相同；
     */
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if(root1 == null || root2 == null) return false;
        return helper(root1, root2) || HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

    //当前树结构相同：当前节点值相同、左子树结构相同、右子树结构相同
    public boolean helper(TreeNode A, TreeNode B){
        if(B == null) return true;
        //B已经不是null, 且A还是null
        if(A == null) return false;
        return A.val == B.val && helper(A.left, B.left) && helper(A.right, B.right);
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
