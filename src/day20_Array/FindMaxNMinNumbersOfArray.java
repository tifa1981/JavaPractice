package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxNMinNumbersOfArray {
    public static void main(String[] args) {
        // find min and max numbers from the data user entered

        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i]= scan.nextInt(); // each number user entered will be assigned to [i]-the indexes of the array numbers
        }
        int max= numbers[0];
        int min=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max){
                max = numbers[i];
            }else if(numbers[i]<min){
                min=numbers[i];
            }


        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("max = " + max);
        System.out.println("min = " + min);



    }
}
