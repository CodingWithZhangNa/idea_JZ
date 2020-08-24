package com.interview.JZ;

import java.util.Arrays;

public class JZ32 {

    public String minNumber (int[] nums){
        if(nums == null || nums.length == 0)
            return null;

        //int类型的数组转换成String类型的数组
        String[] ss = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            ss[i] = String.valueOf(nums[i]);
        }

        //对String数组进行排序
        //Arrays.sort(ss,(参数列表) -> (返回语句))
        //lambda函数知识点
        Arrays.sort(ss,(s1,s2) -> ((s1 + s2).compareTo(s2 + s1)));

        //String[] 数组转换为String 类型
        StringBuilder sb = new StringBuilder();
        for(String s : ss){
            sb.append(s);
        }
        return sb.toString();
    }

}
