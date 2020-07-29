package com.interview.JZ;

import java.util.ArrayList;

public class JZ42 {

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,5};
        System.out.println(findNumbersWithSum(arr,4));
    }

    public static ArrayList<Integer> findNumbersWithSum(int[] arr,int sum){
        ArrayList<Integer> res = new ArrayList<>();
        if(arr == null || arr.length < 2){
            return res;
        }

        int L = 0,R = arr.length - 1;
        while (L < R){
            if(arr[L] + arr[R] == sum){
                res.add(arr[L]);
                res.add(arr[R]);
                return res;
            }

            if(arr[L] + arr[R] < sum){
                L++;
            }else{
                R--;
            }

        }
        return res;
    }

}
