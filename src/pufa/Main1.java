package pufa;

import java.util.Scanner;

public class Main1 {
    /*
    题目：找出给定字符串中第一个不重复的元素
    输入输出：字符串类型
    思路：最直观的解法就是利用循环挨个儿从第一个元素起往后面找有没有重复，如果遍历完成后还没有，那么这个元素就是第一个
    没有重复的元素，直接在循环体中返回值就可以了。那么具体解法就需要两个循环控制，第一个用来定位要查看的元素，第二个
    循环用来在字符串中找有没有跟他重复的元素。算法时间复杂度：O（n^2）
     */

    public static void main(String[] args) {
        //String str = "toothbbc";
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(findCharInPlace(str));
    }

    public static String findCharInPlace(String str) {
        if (str.length() <= 0)
            return null;
        boolean flag = false;

        for (int i = 0; i < str.length(); i++) {
            flag = false;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                return str.charAt(i) + "";
            }
        }

        return "";
    }
}












    /*
    public static String findCharInPlace(String str){
        boolean flag = false;
        if(str.length() <= 0)
            return null;

        for(int i = 0; i < str.length(); i++){
            flag = false;
            for(int j = 0; j < str.length(); j++){
                if(i != j && str.charAt(i) == str.charAt(j)){
                    flag = true;
                    break;
                }
            }

            if(!flag){
                return str.charAt(i) + "";
            }

        }

        return "";


    }

     */
