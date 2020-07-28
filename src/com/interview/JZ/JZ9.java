package com.interview.JZ;

/*
n=1时，只有1种跳法，f(1)=1
n=2时，一次1阶或2阶(1)，f(2)=f(1)+1;
n=3时，一次1阶或2阶或3阶(1)，f(3)=f(1)+f(2)+1;
n=n时，一次1阶，2阶，...,n阶(1)，得出结论：f(n)=f(1)+f(2)+..+f(n-1)+1;
又f(n-1)=f(1)+f(2)+..+f(n-2)+1;
所以f(n)=2*f(n-1)
 */
public class JZ9 {

    public static void main(String[] args) {
        System.out.println(jumpFloor2(4));
    }

    public static int jumpFloor2(int targrt){
        if(targrt == 0)
            return -1;
        if(targrt == 1)
            return 1;

        return 2*jumpFloor2(targrt -1 );
    }

}
