package pufa;

public class Main32 {
    /*
    题目：查找字符串数组中的最长公共前缀
    例如：输入：["flower","flow","flight"]，输出："fl"。
    思路：先找出字符串数组中，最短的字符串长度，以它为基准，这样其它比它长的字符串跟它之间肯定没有公共的部分；再循环比较
         字符串的每一位，如果出现不同就输出。
     */

    public static void main(String[] args) {
        String[] as = {"flower","flow","flight"};
        System.out.println(longestSameStr(as));
    }

    public static String longestSameStr(String[] as){
        if(as.length == 0 || as == null)
            return "";
        if(as.length == 1)
            return as[0];
        int len = as[0].length();
        for(String s : as){
            len = Math.min(len,s.length());
        }
        String str = "";
        for(int i = 0; i < len; i++){
            for(int j = 1; j < as.length; j++){
                if(as[j].charAt(i) != as[0].charAt(i)){
                    return str;
                }
            }
            str = str + as[0].charAt(i);
        }
        return str;
    }
}
