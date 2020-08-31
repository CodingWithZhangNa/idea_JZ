package com.interview.JZ;

public class JZ11 {
    public static void main(String[] args) {
        System.out.println(new JZ11().NumberOf1(10));
    }

    public int NumberOf1(int n){
        int ans = 0;
        for(int i = 0; i < 32; i++){
            if((n & 1) == 1)
                ans++;
            n = n >> 1;
        }
        return ans;
    }
}
