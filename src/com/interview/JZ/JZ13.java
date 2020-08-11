package com.interview.JZ;

import java.util.Arrays;

/*
冒泡排序是交换前面的一个数比后面的一个数大的情况，这题是交换前面是偶数而后面是基数的情况。
 */

public class JZ13 {

    public static int[] reOrderArray(int [] array) {
        for(int i = array.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if( !odd(array[j]) && odd(array[j + 1]) ){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    private static boolean odd(int n) {
        return (n % 2) != 0 ? true : false;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int[] ans = reOrderArray(array);
        System.out.println(Arrays.toString(ans));
    }

}
