package day17_While_DoWhileLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1= scan.nextInt();

        System.out.println("Enter your second number: ");
        int num2= scan.nextInt();

        // +,-

        System.out.println("Enter a math operator: ");
        char ch = scan.next().charAt(0);
        while(!(ch == '+'||ch =='-')){ // the while loop will be terminated when the condition becomes false
                                       // it's best to use while loop when we don't know how many times the loop is executed.
            System.out.println("Invalid operator, please re-enter");
            ch = scan.next().charAt(0);

          /*  for(int i=0; !(ch == '+'||ch =='-')){
                System.out.println("Invalid operator, please re-enter");
                ch = scan.next().charAt(0);
                it is best to use for loop when we know the number of times the loop will be executed.
           */


        }
        System.out.println((ch=='+')? num1+num2 : num1-num2);
    }
}
