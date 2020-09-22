package pufa;

import java.util.Scanner;

public class Main13 {
    /*
    题目：十进制转二进制
    思路：String字符串拼接法
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入十进制数：");
        int num = input.nextInt();
        String a = "";
        while (num != 0){
            a = num%2 + a;
            num = num/2;
        }
        System.out.println(a);
        input.close();
    }
}
