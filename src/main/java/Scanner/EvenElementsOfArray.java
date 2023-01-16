package Scanner;

import java.util.Scanner;

public class EvenElementsOfArray {
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

            // to print result
        int count= noOfEvens(numbers);

      int[]  result= isEvenElement(numbers);
        System.out.println("Here are the even elements");
        for (int i = 0; i < count; i++) {
            System.out.println(result[i]);
        }


    }

    private static int[] isEvenElement(int[] numbers) {

        int j=0;
        int count= noOfEvens(numbers);
        int[] evenNums = new int[count];
        for (int i = 0; i < numbers.length; i++) {

             if (numbers[i] % 2 == 0) {
                evenNums[j++]=numbers[i];
             }
        }
        return evenNums;
    }

    private static int noOfEvens(int[] numbers) {
        int count=0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }


}
