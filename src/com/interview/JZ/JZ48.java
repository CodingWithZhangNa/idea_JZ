package com.interview.JZ;

public class JZ48 {
    /*
     * 计算机中存整数n是用补码存的
     * 如果n为正数，则原码=反码=补码
     * 如果n为负数，则补码=反码+1
     * 本题是考察对位运算的运用，使用位运算来实现两数的加法
     * 观察发现，无进位和运算就是按位异或结果，进位就是与运算结果但是需要左移一位，因为进位影响下一位的运算
     * 所以s = a + b, 其实就是无进位和+进位的结果
     * 如果进位等于0，说明此时a+b的结果就等于无进位和，返回无进位和即可
     * 如果进位不为0，则说明a+b的结果等于无进位和+进位，此时，把无进位和作为a，进位作为b，继续计算
     */
    public static int add(int num1, int num2) {
        int sum1, sum2;
        do {
            sum1 = num1 ^ num2;
            sum2 = (num1 & num2) << 1;
            num1 = sum1;
            num2 = sum2;
        }while ( num2 != 0 );
        return num1;
    }

    public static void main(String[] args) {
        System.out.println(add(1,2));
    }
}
