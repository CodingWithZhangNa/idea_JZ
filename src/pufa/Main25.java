package pufa;

import java.util.Scanner;

public class Main25 {
    /*
    题目：爬一个或者两个台阶，输入1 <= n < 90的数字为台阶数，以输入0作为结束标志，输出n个台阶共有多少种上楼方式。
    输入：1，2，3，4，0    输出：1，2，3，5
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入台阶数：");
        int a = in.nextInt();
        System.out.println(a + "个台阶共有" + methodOfTaiJie(a) + "种上楼方式");
    }

    public static int methodOfTaiJie(int num) {
        if (num < 1 || num >= 90)
            return num;

        if (num <= 2) {
            return num;
        } else {
            return methodOfTaiJie(num - 1) + methodOfTaiJie(num - 2);
        }
    }
}
