package com.bootcoding.dsa.array;

public class MajorityElement_169 {
    public static void main(String[] args) {
        int[] nums = {};
        majorityElement(nums);
    }
    public static int majorityElement(int[] nums) {
        int n = nums.length/2;
       int result = 0;
       int count =0;
        for ( int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    count++;
                }
                if(count >n){
                    result = nums[i];
                    return result;
                }
            }

        }
        return result;
    }
}
