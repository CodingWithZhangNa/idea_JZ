package pufa;

import java.util.Scanner;

public class Main9 {
    /*
    题目：数组中奇数多，还是偶数多，输出yes或者no
    思路：用数组中数对2取余运算，余数为0就是偶数，余数为1就是奇数
     */

/*
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int even = 0;
        int odd = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }

        System.out.println("偶数为: " + even + "个 ");
        System.out.println("奇数为: " + odd + "个 ");
        String str = (odd > even) ? "yes" : "no";
        System.out.println(str);
    }

 */
public static void main(String[] args) {
    int[] arr = new int[10];
    Scanner in = new Scanner(System.in);
    int odd = 0,even = 0;
    System.out.println("请输入十个整数，以空格隔开");
    for(int i = 0; i < arr.length; i++){
        arr[i] = in.nextInt();
    }
    printArrays(arr);
    for(int i = 0; i < arr.length; i++){
        if(arr[i] % 2 == 0){
            even++;
        }else{
            odd++;
        }
    }
    System.out.println("奇数为" + odd +"个，偶数为" + even +"个");
    String str = (odd > even) ? "yes" : "no";
    System.out.println(str);

}

    private static void printArrays(int[] arr) {
        System.out.print("{");
        for(int i = 0; i < arr.length; i++){
            if(i != arr.length - 1){
                System.out.print(arr[i] + ",");
            }else{
                System.out.print(arr[i] + "}");
            }
        }
        System.out.println();
    }

}
