package com.interview.JZ;

public class JZ26 {
    private TreeNode cur;   //链表当前节点
    private TreeNode realHead;   //链表真正头结点

    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null)
            return null;

        Convert(pRootOfTree.left);   //左

        if(cur == null){   //根
            cur = pRootOfTree;
            realHead = pRootOfTree;
        }else{
            cur.right = pRootOfTree;
            pRootOfTree.left = cur;
            cur = pRootOfTree;
        }
        Convert(pRootOfTree.right);    //右
        return realHead;
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
