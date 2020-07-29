package com.interview.JZ;

public class JZ50 {

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,2,3};
        JZ50 test = new JZ50();
        System.out.println(test.duplicate(arr));
    }

    public static boolean duplicate(int[] arr){
        if(arr == null || arr.length <= 0){
            return false;
        }

        for(int i = 0;i < arr.length;i++){
            if(arr[i] < 0 || arr[i] > arr.length - 1)
                return  false;
        }

        for(int i =0;i < arr.length;i++){
            while (arr[i]!=i){
                if(arr[i] == arr[arr[i]]){
                    System.out.println(arr[i]);
                    return true;
                }else{
                    int temp = arr[i];
                    arr[i] = arr[temp];
                    arr[temp] = temp;
                }
            }
        }
        return false;
    }

}
