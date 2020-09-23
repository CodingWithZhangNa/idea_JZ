package pufa;

import java.util.Scanner;

public class Main30 {
    /*
    题目：回文数相加，例：输入2 输出1+121；输入3 输出1+121+12321。
    思路：先算一个数，比如输入3，先计算12321，再递归计算。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        System.out.println("输入整数的回文数相加结果为：");
        System.out.println(addBackNumber(num));
        sc.close();
    }

    public static int addBackNumber(int num){
        if(num == 1)
            return num;

        StringBuilder list = new StringBuilder();
        for(int i = 1; i <= num; i++){
            list.append(i);
        }

        for(int i = num-1; i > 0; i--){
            list.append(i);
        }

        String temp = list.toString();
        int ans1 = Integer.parseInt(temp);
        return ans1 + addBackNumber(num - 1);

    }
}
