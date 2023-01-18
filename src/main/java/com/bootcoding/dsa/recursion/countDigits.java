package com.bootcoding.dsa.recursion;

public class countDigits {
    public static int countDigits(int n){
        if(n<=9){
            return 1;

        }
        return 1 + countDigits(n/10);

    }

    public static void main(String[] args) {
        System.out.println( countDigits(99));
    }
}
