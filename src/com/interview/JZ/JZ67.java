package com.interview.JZ;

/*
剪绳子；
思路：动态规划
假设f(n)为长度为n的绳子剑成若干段后的最大乘积。那么如果我们只剪一刀，该绳子就会分为两部分，假设在i上剪断，
我们再求出这两部分绳子的最大乘积f(i)，f(n-i)。然后不断以相同的方式进行分割，可以得到f(n)=max(f(i)*f(n-i))。
我们可以用递归求出来，因为这是一个自上而下的式子，但递归有许多重复的计算，效率低。这题我们采用自下而上的方式，用动态规划来做。
f(1)，f(2)，f(3)都很容易得到，然后我们可以推出f(4)，f(5)，然后一直往后推出至f(n)。
 */

public class JZ67 {

    public static void main(String[] args) {
        int len = 3;
        System.out.println(maxLen(len));
    }

    public static int maxLen(int len){
        if(len < 2)
            return 0;
        if(len == 2)
            return 1;
        if(len == 3)
            return 2;
        int max = 0;
        int[] array = new int[len + 1];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        for(int i = 4; i <= len; i++){
            for(int j = 1; j <= i/2; j++){ //绳子只需要剪一半就可以，剪i和剪n-i是一回事
                int pro = array[j]*array[i-j];
                if(pro > max)
                    max = pro;
                array[i] = max;
            }
        }
        return array[len];
    }

}
