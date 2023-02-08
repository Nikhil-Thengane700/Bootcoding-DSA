package com.bootcoding.dsa.sorting;

public class selectionSort {

    public static void main(String[] args) {
        int[] array  = {12,60,30,25};
        int [] result = selectionzSorting(array);
        for (int i = 0; i< result.length ; i++) {
            System.out.print(result[i]+ " ");
        }
    }


    public static int[] selectionzSorting(int[] arr){

        for (int i = 0; i < arr.length ; i++) {
            int min=i;
            for (int j = i+1; j < arr.length ; j++) {
                  if(arr[j]>arr[min]) {
                      min = j;
                  }}
                      int temp = arr[min];
                      arr[min] = arr[i];
                      arr[i] = temp;
        }

        return arr;
    }
}
