package com.interview.JZ;

public class JZ30 {
    /*
    高频题
    题目：给一个数组，返回它的最大连续子序列的和；
    思路：(1）暴力法：两个for循环枚举子序列的首尾，利用sum数组计算子序列和，找到最大值
         (2)动态规划：动态规划就是从小问题到大问题，正向保存一个以每一个数结尾的最大子序列和的数组，然后递推到最后一个
     */

    //暴力法
    public static int findGreatestSumOfSubarray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    //动态规划
    public static int findGreatestSumOfSubarray1(int[] arr) {
        if(arr == null || arr.length == 0){
            return 0;
        }
        int[] end = new int[arr.length];
        end[0] = arr[0];
        int res = arr[0];
        for(int i = 1; i < arr.length; i++){
            end[i] = end[i - 1] > 0 ? end[i - 1] + arr[i] : arr[i];
            res = Math.max(res,end[i]);
        }
        return res;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(findGreatestSumOfSubarray(arr));
        System.out.println(findGreatestSumOfSubarray1(arr));
    }

}
