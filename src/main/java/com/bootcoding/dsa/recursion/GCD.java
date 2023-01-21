package com.bootcoding.dsa.recursion;

public class GCD {
    public static int GCD(int x, int y){
        if(x==0){
            return y;
        }
       return GCD(y%x,x);

    }

    public static void main(String[] args) {
        System.out.println(GCD(12,8));
    }
}
