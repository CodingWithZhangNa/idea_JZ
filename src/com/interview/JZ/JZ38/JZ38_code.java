package com.interview.JZ.JZ38;

public class JZ38_code {
    public int TreeDepth(TreeNode root) {
        if( root== null )
            return 0;
        int Tleft = TreeDepth( root.left );
        int Tright = TreeDepth( root.right );
        return Tleft > Tright ? ( Tleft+1 ) : ( Tright+1 );
    }

    public static void main(String...args)
    {
        //
        TreeNode treeNode8= new TreeNode(8);
        TreeNode treeNode6= new TreeNode(6);
        TreeNode treeNode10= new TreeNode(10);
        TreeNode treeNode5= new TreeNode(5);
        TreeNode treeNode7= new TreeNode(7);
        TreeNode treeNode9= new TreeNode(9);
        TreeNode treeNode11= new TreeNode(11);
        //
        treeNode8.left= treeNode6;
        treeNode8.right= treeNode10;
        treeNode6.left= treeNode5;
        treeNode6.right= treeNode7;
        treeNode10.left= treeNode9;
        treeNode10.right= treeNode11;
        //
        TreeNode head= treeNode8;
        JZ38_code s = new JZ38_code();
        int res = s.TreeDepth(head);
        System.out.println(res);
    }

}
