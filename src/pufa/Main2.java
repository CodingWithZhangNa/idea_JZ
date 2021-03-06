package pufa;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    /*
    题目：数组排序；
     */
    public static void main(String[] args) {
        //int[] array = {5,2,66,3,7};
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            StringBuilder s = new StringBuilder();
            for (int i = 1; i < str.length() - 1; i++) {
                s.append(str.charAt(i));
            }
            str = s.toString();
            String[] array = str.split(",");
            int[] arr = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                arr[i] = Integer.parseInt(array[i]);
            }
            System.out.println(Arrays.toString(bubbleSort(arr)));
        }
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
