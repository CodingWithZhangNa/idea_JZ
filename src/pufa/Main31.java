package pufa;

import java.util.Scanner;

public class Main31 {
    /*
    题目：输入两个整数 22 33 ，输出两个数转化为二进制不同的个数，输出5。
    思路：异或，相同为0，相异为1，再统计1的个数。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("这两个数转化为二进制不同的个数为：" + differentNumberOfTwoNum(num1,num2));
        sc.close();
    }

    public static int differentNumberOfTwoNum(int m, int n){
        int i = m^n;
        int count = 0;
        char[] c = Integer.toBinaryString(i).toCharArray();
        for(int j = 0; j < c.length; j++) {
            if (c[j] == '1') {
                count++;
            }
        }
        return count;
    }
}
