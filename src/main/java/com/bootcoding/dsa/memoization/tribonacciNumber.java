package com.bootcoding.dsa.memoization;

import java.util.HashMap;

public class tribonacciNumber {
    HashMap<Integer, Integer> cache = new HashMap ();

    public int tribonacci(int n) {


        if(n==0){
            return 0;
        }

        if( n <= 2 ){
            return 1;
        }

        if(cache.containsKey(n)){
            return cache.get(n);
        }

        cache.put(n,tribonacci(n-1)+ tribonacci(n-2)+ tribonacci(n-3));
        return cache.get(n);
    }
}
