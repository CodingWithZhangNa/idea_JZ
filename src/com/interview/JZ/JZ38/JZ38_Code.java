package com.interview.JZ.JZ38;

public class JZ38_Code {
    public int TreeDepth(TreeNode root) {
        if( root== null )
            return 0;
        int Tleft = TreeDepth( root.left );
        int Tright = TreeDepth( root.right );
        return Tleft > Tright ? ( Tleft+1 ) : ( Tright+1 );
    }

    public static void main(String[] args)
    {

        /*
         *              5
         *            /   \
         *           4     6
         *          / \   / \
         *         12    13  6
         *        / \       / \
         *       9   1     5   1
         *
         */

        TreeNode a= new TreeNode(5);
        TreeNode b= new TreeNode(4);
        TreeNode c= new TreeNode(6);
        TreeNode d= new TreeNode(12);
        TreeNode e= new TreeNode(13);
        TreeNode f= new TreeNode(6);
        TreeNode g= new TreeNode(9);
        TreeNode h= new TreeNode(1);
        TreeNode i= new TreeNode(5);
        TreeNode j= new TreeNode(1);
        a.left= b;
        a.right= c;
        b.left= d;
        c.left= e;
        c.right= f;
        d.left= g;
        d.right= h;
        f.left= i;
        f.right= j;
        JZ38_Code s = new JZ38_Code();
        System.out.println(s.TreeDepth(a));
    }

}
