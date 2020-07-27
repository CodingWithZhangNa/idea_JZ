package com.interview.JZ.JZ18;

public class JZ18_Code {

    public static void main(String[] args) {
        TreeNode a = new TreeNode(5);
        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(6);
        TreeNode d = new TreeNode(12);
        TreeNode e = new TreeNode(13);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(9);
        TreeNode h = new TreeNode(1);
        TreeNode i = new TreeNode(5);
        TreeNode j = new TreeNode(1);
        a.left = b;
        a.right = c;
        b.left = d;
        c.left = e;
        c.right = f;
        d.left = g;
        d.right = h;
        f.left = i;
        f.right = j;
        JZ18_Code s = new JZ18_Code();
        s.Mirror(a);
        System.out.println(a);
    }

    public static void Mirror(TreeNode root) {

        if (root != null) {

            if (root.left != null) {
                Mirror(root.left);
            }
            if (root.right != null) {
                Mirror(root.right);
            }

            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }

    }

}

