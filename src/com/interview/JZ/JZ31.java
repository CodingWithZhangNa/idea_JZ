package com.interview.JZ;

public class JZ31 {
    public int NumberOf1Between1AndN_Solution(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++){
            int x = i;
            while(x != 0){
                if(x % 10 == 1){
                    sum++;
                };
                x = x / 10;
            }
        }
        return sum;
    }
}
