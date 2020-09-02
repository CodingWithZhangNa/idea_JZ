package com.interview.JZ;

public class JZ23 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null || sequence.length == 0)
            return false;
        return judge(sequence, 0, sequence.length - 1);
    }

    private boolean judge(int[] sequence, int L, int R){
        if(L >= R)
            return true;
        //后序遍历，数组最后一个元素为根节点
        int j = R;
        //找到右子树节点第一个元素的下标，也判断了左树元素小于根节点元素
        for(int i = L; i <= R; i++){
            if(sequence[i] > sequence[R]){
                j = i;
                break;
            }
        }
        //判断右子树所有元素大于根节点元素
        for(int i = j; i <= R; i++){
            if(sequence[i] < sequence[R])
                return false;
        }
        return judge(sequence, L, j-1) && judge(sequence, j, R-1);
    }
}
