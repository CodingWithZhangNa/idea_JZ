package pufa;

import java.util.Scanner;

public class Main33 {
    /*
    题目：打印杨辉三角
    思路：每一行的第一列和最后一列为1；从第三行第二列开始，这个数字等于它上一行的前一列和上一行的本列数字之和；
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行数：");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        //把每一行的第一列和最后一列设为1
        for(int i = 0; i < arr.length; i++){
            arr[i][0] = 1;
            arr[i][i] = 1;
        }

        //设置中间元素
        for(int i = 2; i < arr.length; i++){
            for(int j = 1; j <= i; j++){
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }

        //遍历二维数组
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}