package pufa;

import java.util.Scanner;

public class Main27 {
    /*
    题目：判断从1990到2010年中的闰年，并打印。
    思路：一个年份能被4整除且不能被100整除，或者能被400整除，即为闰年。
     */

    public static void main(String[] args) {
        System.out.println("1990到2010中为闰年的年份：");
        for (int i = 1990; i <= 2010; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
