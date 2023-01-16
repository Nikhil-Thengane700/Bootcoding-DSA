package Scanner;

import java.util.Scanner;



public class ScannerArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = sc.nextInt();
        int numbers[]= new int[size];
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println("Enter the number "+ (i+1));
            int number= sc.nextInt();
            numbers[i]=number;
        }
       printArray(numbers);
    }

    public static void printArray(int[] numbers){
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);
        }
    }
}
