package pufa;

import java.util.Scanner;

public class Main6 {
    /*
    题目：输出字符串的最大回文子字符串的长度。
    思路：中心扩展法
         长度为奇数的回文串，以字母为中心
         长度为偶数的回文串，以两个字母之间空隙为中心
     */

    public static void main(String[] args) {
        //String str = "abbba";
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(getMaxLen(str));
    }

    public static String getMaxLen(String str){
        if(str.length() <= 1 || str == null)
            return str;
        int ll = 0;
        int rr = 0;
        int res = 1;

        for(int i = 0; i < str.length(); i++){
            int l = i-1;
            int r = i+1;
            while (l >= 0 && r < str.length() && str.charAt(l) == str.charAt(r)){
                int len = (r-l+1);
                if(len > res){
                    res = len;
                    ll = l;
                    rr = r;
                }
                l--;
                r++;
            }

            l = i;
            r = i+1;
            while (l >= 0 && r < str.length() && str.charAt(l) == str.charAt(r)){
                int len = (r-l+1);
                if(len > res){
                    res = len;
                    ll = l;
                    rr = r;
                }
                l--;
                r++;
            }
        }
        return str.substring(ll,rr+1);
    }
}











   /* public static String getMaxLen(String str){
        if(str == null || str.length() <= 1)
            return str;

        int ll = 0;
        int rr = 0;
        int res = 1;

        for(int i = 0; i < str.length(); i++){

            int l = i - 1;
            int r = i + 1;
            while (l >= 0 && r < str.length() && str.charAt(l) == str.charAt(r)){
                int len = (r - l + 1);
                if(len > res){
                    res = len;
                    ll = l;
                    rr = r;
                }
                l--;
                r++;
            }

            l = i;
            r = i+1;
            while (l >= 0 && r < str.length() && str.charAt(l) == str.charAt(r)){
                int len = (r - l + 1);
                if(len > res){
                    res = len;
                    ll = l;
                    rr = r;
                }
                l--;
                r++;
            }

        }
        return str.substring(ll,rr+1);
    }

    */

