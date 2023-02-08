package com.bootcoding.dsa.array;

public class SmallerNoThanTheCurrent_1365 {
    public static void main(String[] args) {
        int [] numbers= {8,1,2,2,3};
         int [] result = smallerNumbersThanCurrent(numbers);

        for (int i = 0; i < result.length ; i++) {
            System.out.print(result[i]+ ",");
        }
    }
    public  static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count =0;
            int num= nums[i];
            for (int j = 0; j < nums.length ; j++) {

                if(num - nums[j] >0  && num > nums[j]){
                    count++;

                }
            }
            arr[i]=count;
        }
        return arr;
    }
}
