package Scanner;

import java.util.Scanner;

public class MinElementOfArray {
    public  static int minElement(int[] numbers){
        int temp=numbers[0];
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = i+1; j < numbers.length ; j++) {
                if(numbers[j]<temp){
                    temp=numbers[j];
                }
            }

        }
        return temp;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int[] numbers= new int[size];
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("Enter the element "+ i);
            int number= sc.nextInt();
            numbers[i]=number;

        }

        //method calling for minElement
        int result = minElement(numbers);
        System.out.println(result);




    }
}
