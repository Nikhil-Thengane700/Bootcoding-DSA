package Scanner;

import java.util.Scanner;

public class ScannerStringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word");
        String word = sc.next();
        char[] output =findDuplicateChar(word);
        System.out.println("Duplicate charecter in "+ word+ " is " + output+ "'");

    }

    private static char[] findDuplicateChar(String word) {
        char[] chars = word.toCharArray();
        char duplicateChar[]= new char[chars.length];
        int count=0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; i < chars.length; i++) {
                if (chars[i] == chars[j]) {
               duplicateChar[count++]=chars[i];

            }
        }
            return  duplicateChar;


    }

        return chars;
    }}



//
