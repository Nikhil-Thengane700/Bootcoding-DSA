package com.bootcoding.dsa.array;

public class GCDofArray1979 {
    public int findGCD(int[] nums) {


        int x = minElement(nums);
        int y = maxElement(nums);

       return findGcd(x,y);

    }

    private int findGcd(int x, int y) {
        if (x == 0) {
            return y;
        }
        return findGcd(y % x, x);
    }


    public  int  minElement(int[] nums){
        int min=nums[0];
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if(nums[j]<min){
                    min=nums[j];
                }
            }

        }
        return min;

    }
    public  static int maxElement(int[] nums)  {
        int max=nums[0];
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if(nums[j]>max){
                    max=nums[j];
                }
            }

        }
        return max;



    }}

