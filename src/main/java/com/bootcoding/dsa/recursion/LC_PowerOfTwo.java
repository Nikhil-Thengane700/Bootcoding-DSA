package com.bootcoding.dsa.recursion;
/*Given an integer n, return true if it is a power of two. Otherwise, return false.

        An integer n is a power of two, if there exists an integer x such that n == 2^x.



        Example 1:

        Input: n = 1
        Output: true
        Explanation: 20 = 1

 */
public class LC_PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n<1){
            return false;

        }
        if(n==1){
          return true;
        }
        if(n%2==1){
            return false;
        }

        isPowerOfTwo(n/2);

        return true;
    }
}



