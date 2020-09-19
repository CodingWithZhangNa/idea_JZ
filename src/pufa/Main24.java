package pufa;

import java.util.Scanner;

public class Main24 {
    /*
    题目：输入 n 和 b，找出 1 到 n 中被 b 整除的个数。
    例如：输入 6 3 ，输出 2。
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int b = in.nextInt();
        System.out.println("1到" + n + "中被" + b + "整除的个数是：" + divNum(n,b));
    }

    public static int divNum(int n, int b){
        int count = 0;
        for(int i = 1; i <= n; i++){
            if( i % b == 0)
                count++;
        }
        return count;
    }
}
