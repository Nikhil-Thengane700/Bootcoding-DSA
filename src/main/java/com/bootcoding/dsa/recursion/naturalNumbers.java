package com.bootcoding.dsa.recursion;

public class naturalNumbers {
    /*1. WAP to print first 50 natural numbers using recursion (1,2,3,4....)*/
    public static void  printNatural(int n){
        if(n==0){
            return;
        }
        printNatural(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        printNatural(50);
    }
}
