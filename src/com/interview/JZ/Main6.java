package com.interview.JZ;

public class Main6 {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0)
            return 0;

        int l = 0;
        int r = array.length - 1;
        while (l < r - 1){
            int mid = (l + r) / 2;
            if(array[mid] >= array[l])
                l = mid;
            else if(array[mid] <= array[l])
                r = mid;
        }
        return array[r];
    }
}
