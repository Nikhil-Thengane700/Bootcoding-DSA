package com.bootcoding.dsa.memoization;

import java.util.HashMap;
class Solution {

    HashMap<Integer, Integer> cache= new HashMap<>();
    public int climbStairs(int n) {
        if (n==1 || n==2){
            return n;
        }

        if (cache.containsKey(n)){
            return cache.get(n);
        }

        cache.put(n,climbStairs(n-1)+ climbStairs(n-2));
        return cache.get(n);
    }
}