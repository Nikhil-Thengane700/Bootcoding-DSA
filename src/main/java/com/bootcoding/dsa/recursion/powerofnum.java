package com.bootcoding.dsa.recursion;

public class powerofnum {
    public static int powerOfNum(int x, int y){
        if(y==0){
            return 1;
        }

        return x *powerOfNum(x,--y) ;
    }

    public static void main(String[] args) {
        int result = powerOfNum(3,5);
        System.out.println(result);
    }
}
