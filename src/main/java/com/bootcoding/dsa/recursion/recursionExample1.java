package com.bootcoding.dsa.recursion;

public class recursionExample1 {

    public static void  print (int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        print(10);
    }
}
