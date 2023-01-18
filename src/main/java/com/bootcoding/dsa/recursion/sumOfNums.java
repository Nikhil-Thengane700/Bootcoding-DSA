package com.bootcoding.dsa.recursion;

public class sumOfNums {
    public static int sumOfNums(int n){

      if(n==0){
          return 0;

      }
      return n + sumOfNums(n-1);
    }

    public static void main(String[] args) {

        System.out.println(sumOfNums(5));

    }
}
