package com.interview.JZ;

public class JZ40 {

    public static void main(String[] args) {
        int[] array = {1,1,2,3,2,3,4,5};
        int[] ans = findNumsAppearOnce(array);
        for(int i = 0; i < ans.length; i++) System.out.println(ans[i] + " ");
    }

    public static int[] findNumsAppearOnce(int[] array){

        if(array.length <2 || array == null)
            return array;
        int tmp = 0;
        for(int i = 0;i<array.length;i++){
            tmp^=array[i];
        }
        int digit = tmp&(-tmp);
        int[] res = new int[2];
        for(int i = 0;i < array.length;i++){
            if((array[i] & digit) == 0)
                res[0]^=array[i];
            else
                res[1]^=array[i];
        }
        return res;
    }

}
