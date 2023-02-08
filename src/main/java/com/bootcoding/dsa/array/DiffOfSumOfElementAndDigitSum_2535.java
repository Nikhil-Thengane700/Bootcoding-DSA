package com.bootcoding.dsa.array;

public class DiffOfSumOfElementAndDigitSum_2535 {
    public int differenceOfSum(int[] nums) {
        int x = 0;
        for (int i = 0; i <nums.length ; i++) {
            x = x+ nums[i];
        }
        int y = sumOfDigits(nums);

        return x-y;
    }
        int sum =0;
        int r  =0;
    private int sumOfDigits(int[] nums) {
        for (int i = 0; i <nums.length; i++) {
           int temp= nums[i];
          while (temp>0){
              r =temp%10;
              sum =sum+r;
              temp =temp/10;

          }
         return sum;
        }
        return sum;
    }
}
