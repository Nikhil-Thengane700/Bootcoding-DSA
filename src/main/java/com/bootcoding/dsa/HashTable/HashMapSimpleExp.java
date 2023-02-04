package com.bootcoding.dsa.HashTable;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapSimpleExp {
    public static void main(String[] args) {
        HashMap <String,Integer> map = new HashMap<>();
        map.put("India", 123);
        map.put("Pak", 24);
        map.put("US", 15);
        System.out.println(map);

        // search operation

        if(map.containsKey("China")){
            System.out.println("The key is present in map");
        }
        else{
            System.out.println("The key is not present in map");
        }

        //.get function

        System.out.println(map.get("China"));
        System.out.println(map.get("US"));

        //Iteration (1)
        for( Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.print(e.getKey());
            System.out.println(e.getValue());
        }


        //Iteration (2)
        Set<String> keys = map.keySet();
        for(String key : keys) {
            System.out.println(key+ " " + map.get(key));
        }



    }
}
