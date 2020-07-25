package com.interview.JZ;

public class JZ51 {
    public static int[] multiply(int[] A) {
        /*
        思路：分成两部分的乘积，第一部分可以自上而下，第二部分自下而上
         */
        if (A == null || A.length < 1)
            return A;
        int len = A.length;
        int[] B = new int[len];
        B[0] = 1;    // 数组B中第一个数字没有左边部分，所以左边乘积数组第一个数字是1
        for (int i = 1; i < len; i++)  //第一部分可以自上而下
            B[i] = B[i - 1] * A[i - 1];

        int temp = 1;   //temp用来保存第二部分
        for (int i = len - 2; i >= 0; i--) {   //第二部分可以自下而上
            temp = temp * A[i + 1];
            B[i] *= temp;
        }
        return B;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int[] B = multiply(A);
        for (int value : B) System.out.print(value + " ");
    }

}
