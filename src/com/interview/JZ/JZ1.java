package com.interview.JZ;

public class JZ1 {
    public static void main(String[] args) {
        int[][] array = new int[2][2];
        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 8;
        array[1][1] = 3;
        System.out.println(findNumber(2,array));
    }

    public static boolean findNumber(int target, int [][] array) {
        int r = array.length - 1, c = 0;
        while( r >= 0 && c < array[0].length ){
            if(array[r][c] == target)
                return true;
            else if(array[r][c] > target)
                r--;
            else
                c++;
        }
        return false;
    }

}
