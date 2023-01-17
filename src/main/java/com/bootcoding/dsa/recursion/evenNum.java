package com.bootcoding.dsa.recursion;

public class evenNum {
    public static void evenNum(int n){
        if (n==1){
            return;
        }
        evenNum(n-1);
        if(n%2==0){

            System.out.println(n);
        }

    }

    public static void main(String[] args) {
        evenNum(5);
    }
}
