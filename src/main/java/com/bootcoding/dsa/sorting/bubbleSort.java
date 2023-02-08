package com.bootcoding.dsa.sorting;

public class bubbleSort {
    public static void main(String[] args) {
      int [] arr = { 2,25,12,10,23};
       int[] result= bubbleSorting(arr);

        for (int i = 0; i <result.length ; i++) {
            System.out.print(result[i]+ " ");
        }
    }

    public static int[] bubbleSorting(int[] nums) {
        int temp =0;
        for (int i = 0; i < nums.length; i++) {


            for (int j = 0; j < nums.length; j++) {

               if(nums[i]>nums[j]){
                   temp = nums[i];
                  nums[i]= nums[j];
                  nums[j] =temp;

               }
          }

        }

        return nums;
    }}