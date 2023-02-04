package com.bootcoding.dsa.HashTable;

import java.util.HashMap;

public class HashTableExample {
    public static void main(String[] args) {
        int a[] = {10,20,10,30,20,40};
        // find duplicate element i an array

        HashMap store = new HashMap();
        for (int i = 0; i < a.length ; i++) {
            if(store.containsKey(a[i])){
                int value = (int) store.get(a[i]);
                store.put(a[i], value+1);

            }
            else{
                store.put(a[i],1);
            }

        }

        for(Object key : store.keySet()){
            int k = (int) key;
            int value= (int) store.get(k); // no of occurences
            if(value>1){
                System.out.println(k);
            }
        }

    }
}
