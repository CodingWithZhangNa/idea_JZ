package pufa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main28 {
    /*
    题目：n的阶乘；
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数n：");
        int num = sc.nextInt();
        System.out.println(num + "的阶乘为：" + multiply(num));
        sc.close();
    }

    public static int multiply(int num){
        if (num <= 2) {
            return num;
        }

        int[] array = new int[num];
        array[0] = 1;
        array[1] = 2;
        for(int i = 2; i < num; i ++){
            array[i] = (i+1)*array[i-1];
        }
        return array[array.length - 1];

    }

}
