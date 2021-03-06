package pufa;

import java.util.Scanner;

public class Main20 {
    /*
    题目：给三个数abc,能否在1000-9999之间找到一个数x，满足x%a=0且（x+1）%b=0且（x+2）%c=0,找不到这个数x就
    返回Impossible。
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        String ans = findNumber(num1,num2,num3);
        System.out.println(ans);
    }

    public static String findNumber(int a, int b, int c){
        for(int i = 1000; i < 9999; i++){
            if( (i%a == 0) && ((i+1) % b == 0) && ((i+2) % c == 0) ){
                return "can";
            }
        }
        return "Impossible";
    }
}
