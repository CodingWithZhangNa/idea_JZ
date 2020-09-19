package pufa;

import java.util.Scanner;

public class Main23 {
    /*
    题目：找出正整数中偶数，并输出相加后的数，要用long。例：输入5548输出12。
    思路：int型对10取余得到末位数，再整除10。
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextInt();
        System.out.println(addEven(num));
    }

    public static int addEven(long num) {
        int sum = 0;
        while (num > 0) {
            int temp = (int) (num % 10);
            if (temp % 2 == 0)
                sum += temp;
            num /= 10;
        }
        return sum;
    }
}
