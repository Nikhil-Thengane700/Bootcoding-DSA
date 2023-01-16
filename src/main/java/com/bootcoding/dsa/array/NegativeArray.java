package com.bootcoding.dsa.array;

public class NegativeArray {


    public static void main(String[] args) {
        int[] nums= {-11,22,33,-26};
        int[] result= nagativeArray(nums);
        for (int i = 0; i < result.length; i++) {
            if (result[i] < 0) {


            System.out.println(result[i]);}
        }


    }

    public  static  int[] nagativeArray(int[] digits) {
    //   int count= noOfNegatives(int [] digits);
        int [] a = new int[digits.length] ;

        for (int i = 0; i < digits.length; i++) {


            if (digits[i] < 0) {
                digits[i] = digits[i];


            }

        }
        return digits;

    }

//    public static int noOfNegatives(int[] digits) {
//        int i;
//        for (i = 0; i < digits.length; i++) {
//
//        }
//        //  int count= noOfNegatives();
//        if (digits[i] < 0) {
//            count++;
//        }
//        return count;
//    }


}
