package com.bootcoding.dsa.array;

public class numsWithEvenNumbersDigits_1295 {

    public static void main(String[] args) {
        numsWithEvenNumbersDigits_1295 n = new numsWithEvenNumbersDigits_1295();
        int [] arr = {555,901,482,1771};
        int result = n.findNumbers(arr);
        System.out.println(result);
    }

    public int findNumbers(int[] nums) {
        int evenNums =0;
        for (int i = 0; i <nums.length ; i++) {
            if(countDigit(nums[i])%2==0){
                evenNums++;
            }
        }
        return evenNums;
    }

    private int countDigit(int num) {
        if(num<=9){
            return 1;
        }
        return 1 +countDigit(num/10);
    }
}
