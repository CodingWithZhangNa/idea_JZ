package com.interview.JZ;

public class JZ7 {

    public static int Fibonacci(int n) {
        if(n < 1)
            return 0;
        if(n == 1 || n == 2)
            return 1;
        return Fibonacci(n - 1) + Fibonacci(n - 2);

    }

    public static void main(String[] args) {
        for(int count = 0; count <= 10; count++){
            System.out.printf("Fibonacci of %d is : %d\n", count, Fibonacci(count));
        }
    }

}
