package pufa;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main29 {
    /*
    题目：输入十个数，最大数和最后一个数交换，最小数和第一个数交换；
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入十个数：");
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        numberChange(array);
        System.out.println(Arrays.toString(array));

    }

    public static int[] numberChange(int[] array){
        int min = array[0];
        int minIndex = 0;
        int max = array[0];
        int maxIndex = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
                minIndex = i;
            }
        }

        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
                maxIndex = i;
            }
        }

        int temp1 = array[0];
        array[0] = min;
        min = temp1;
        int temp2 = array[array.length - 1];
        array[array.length - 1] = max;
        max = temp2;

        return array;
    }
}
