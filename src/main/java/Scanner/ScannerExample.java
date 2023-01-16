package Scanner;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int value = sc.nextInt();

        // logic
        if(value%2==0){
            System.out.println(value+ " is even number");
        }else{
            System.out.println(value+"is odd number");
        }

        boolean res = isEvenValue(value);
        System.out.println(res);

        boolean res2 = isOddValue(value);
        System.out.println(res2);

    }

    private static boolean isOddValue(int value) {
       return value%2!=0;
    }

    private static boolean isEvenValue(int value) {
        return value%2==0;
    }
}
