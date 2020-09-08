package com.interview.JZ;

public class JZ34 {
    public int FirstNotRepeatingChar(String str) {
        //直接统计每个单词出现的次数，然后从头开始扫到第一个次数为1的返回数就可以了

        if(str == null || str.length() == 0)
            return -1;
        int[] count = new int[58];
        for(int i = 0; i < str.length(); i++)
            count[str.charAt(i) - 'A']++;
        for(int i = 0; i < str.length(); i++)
            if(count[str.charAt(i) - 'A'] == 1)
                return i;
        return 0;
    }
}
