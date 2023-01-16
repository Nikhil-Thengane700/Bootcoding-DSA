package com.bootcoding.dsa.array;

public class ArraySquare {
    public static void main(String[] args) {
        int[] nums = {2,3,4};
      int[] result = arraySquare(nums);
        for (int i = 0; i < result.length ; i++) {
            System.out.println(result[i]);
        }
    }
    public static  int[] arraySquare(int[] digits){

        for (int i = 0; i < digits.length; i++) {
         digits[i]= digits[i]*digits[i];
        }
        return digits;
    }
}

