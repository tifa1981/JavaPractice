package day11_FizzBuzz;

import java.util.Scanner;

public class FizzBuzzWithNestedIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("number: ");
        int number = scan.nextInt();

        if (number % 5 ==0){
            if (number % 3 ==0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        }
        else if(number % 3==0)
            System.out.println("Buzz");
        else
            System.out.println(number);
    }
}
