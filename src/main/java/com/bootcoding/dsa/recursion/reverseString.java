package com.bootcoding.dsa.recursion;

public class reverseString {

    public static char[] reverse(String s){
        char[] reverse = new char[s.length()];
        reverse=s.toCharArray();
        for (int i = 0; i <s.length()/2 ; i++) {
            char temp =reverse[i];
            reverse[i]= reverse[reverse.length-1];
        }
    return reverse;}
     public static void main(String[] args) {





    }
}
