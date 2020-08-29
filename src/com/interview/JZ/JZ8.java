package com.interview.JZ;

public class JZ8 {
    //思路：n级的方法为跨到n-2级台阶的方法数加上跨到n-1级台阶的方法数；

    public int JumpFloor(int target) {
        if(target < 1)
            return 0;
        if(target == 1 || target == 2)
            return target;
        return JumpFloor(target - 1) + JumpFloor(target - 2);
    }

}
