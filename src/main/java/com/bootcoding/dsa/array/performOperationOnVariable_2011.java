package com.bootcoding.dsa.array;

import javax.imageio.stream.ImageInputStream;

public class performOperationOnVariable_2011 {
    public static void main(String[] args) {
        String[] arr = {"++X","++X","X++"};
        int result =   finalValueAfterOperations(arr);
        System.out.println(result);
    }

    public static int finalValueAfterOperations(String[] operations) {

            int x =0;
        for (int i = 0; i <operations.length ; i++) {
            if(operations[i].equals("X++") || operations[i].equals("++X")){
                x = x+1;

            }
            if(operations[i].equals("X--") || operations[i].equals("--X")){
                x = x-1;
            }




        }
        return x;
    }
}
