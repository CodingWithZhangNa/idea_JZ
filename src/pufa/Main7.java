package pufa;

import com.interview.JZ.JZ3.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Main7 {
    /*
    题目：字符串去重
    思路：新建一个List集合，从头到尾遍历字符串，判断是否包含访问到的字符，如果不包含，将其添加到Stringbuffer中，
    主要使用list.contains()检测重复；
     */
    public static void main(String[] args) {
        String ans = sub("abcdabcd");
        System.out.println(ans);
    }

    public static String sub(String str){
        if(str == null || str.length() <= 0)
            return null;

        List list = new ArrayList();
        StringBuffer sb = new StringBuffer(str);  //把String类型转换为StringBuffer类型
        int j = 0;
        for(int i = 0; i < str.length(); i++){
            if( list.contains(str.charAt(i)) ){
                sb.deleteCharAt(i-j);
                j++;       //因为删除了sb中的字符，有一个偏移
            }else{
                list.add(str.charAt(i));
            }
        }
        return sb.toString();    //把StringBuffer类型转换为String类型
    }
}
