package pufa;

import java.util.Scanner;

public class Main26 {
    /*
    题目：判断一个数是不是素数（质数）
    定义：对于大于1的数，如果除了1和它本身，它不能再被其它正整数整除，那么我们说它是一个质数。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于1的整数：");
        try{
            int a = sc.nextInt();
            if(isPrime(a)){
                System.out.println(a + "是素数");
            }else{
                System.out.println(a + "不是素数");
            }
        }catch(Exception e){
            System.out.println("不是合法的输入！");
        }
        sc.close();
    }

    public static boolean isPrime(int a) {
        boolean flag = true;

        if (a < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
