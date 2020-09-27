package pufa;

import java.util.Scanner;

public class Main14 {
    /*
    题目：输入n个整数，判断并按原顺序输出素数。
     */
    public static void main(String[] args) {
        System.out.println("请输入数组长度：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("请分别输入每个数字：");
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int[] temp = new int[num];
        for (int i = 0; i < arr.length; i++) {
            if (issushu(arr[i]))
                temp[i] = arr[i];
        }

        for(int i = 0; i < temp.length;i++){
            if(temp[i] > 0)
                System.out.print(temp[i] + " ");
        }
    }

    public static boolean issushu(int m) {
        if (m == 0) return false;
        int j = 2;
        while (m % j != 0) {
            j++;
        }
        if (j == m) return true;
        return false;
    }
}

