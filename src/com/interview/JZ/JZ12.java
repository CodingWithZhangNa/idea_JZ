package com.interview.JZ;

public class JZ12 {
    public double Power(double base, int exponent) {
        double ans = 1.0;
        if(exponent >= 0){
            for(int i = 0; i < exponent; i++){
                ans = ans * base;
            }
        }else if (exponent < 0){
            for(int i = 0; i < -exponent; i++){
                ans = ans * base;
            }
            ans = 1 / ans;
        }
        return ans;
    }
}
