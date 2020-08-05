package com.interview.JZ;

import java.util.HashMap;

public class JZ28 {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,2,2,2,2};
        System.out.println(moreThanHalfNum(array));
    }


    //使用map保存每个元素出现的次数，只要某个元素次数超过array.length/2就返回。
    public static int moreThanHalfNum(int[] array){
        if(array == null || array.length == 0)
            return 0;
        if(array.length == 1)
            return array[0];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            map.put(array[i],map.getOrDefault(array[i],0)+1);
            if(map.get(array[i]) > array.length/2)
                return array[i];
        }
        return 0;
    }

}
