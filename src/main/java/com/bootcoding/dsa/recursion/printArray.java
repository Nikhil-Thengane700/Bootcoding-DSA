package com.bootcoding.dsa.recursion;

public class printArray {
    public static void printArray(int[] a, int i){
        if (i ==a.length ){
            return;
        }
        System.out.println(a[i]);
        printArray(a,++i);

    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,8,9,0};
        printArray(a,0);
    }
}
