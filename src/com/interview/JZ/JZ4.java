package com.interview.JZ;

import java.util.Arrays;

public class JZ4 {


    public TreeNode reConstructBinaryTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        int index = -1;
        for (int i = 0; i < inorder.length; i++) {
            if(inorder[i] == preorder[0]){
                index = i;
                break;
            }
        }
        root.left = reConstructBinaryTree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index));
        root.right = reConstructBinaryTree(Arrays.copyOfRange(preorder,index+1,preorder.length),Arrays.copyOfRange(inorder,index+1,inorder.length));
        return root;
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
