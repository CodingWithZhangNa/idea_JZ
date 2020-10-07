package pufa;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    /*
    题目：数组排序；
     */
    public static void main(String[] args) {
        //int[] array = {5,2,66,3,7};
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] array = new int[m];
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    public static int[] bubbleSort(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                int temp;
                if(array[j] > array[j+1] ){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
