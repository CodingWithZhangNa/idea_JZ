package pufa;

import java.util.Scanner;

public class Main36 {
    /*
    浦发机试第二题
    题目：最长公共后缀
     */
    public static void main(String[] args) {
         String[] str = {"1222","3222","4222"};
         System.out.println(longestCommonLast(str).toString());
    }

    public static String longestCommonLast(String[] strs){
        if(strs.length == 0) return"";
        //s总是暂时放求的当前的值
        String s = strs[0];
        for(int i = 1; i < strs.length; i++){
            if(strs[i].length() == 0 || s.length() == 0)
                return "";
            int len1 = strs[i].length();
            int len2 = s.length();
            int len = Math.min(len1,len2);
            int j;
            for(j = 0; j < len; j++){
                if( s.charAt(len2-1-j) != strs[i].charAt(len1-1-j) )
                    break;
            }
            s = s.substring(len2-j);
        }
        return s;
    }
}
