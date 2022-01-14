package replitSolutions;
import java.util.Scanner;

public class TernaryOperator1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = scan.nextInt();


       String result = (x >= 5)? x +" is greater than 5" : "-"+ x + " is less than 5";
        System.out.println(result);



    }
}
/*
Write an expression using the conditional operator (? :) that compares the value of the variable x to 5 and results in:

Ask the user to enter a number and assign it to a variable x (int)
Display x if x is greater than or equal to 5 Display -x if x is less than 5

Ex:
  Enter a Number
  10

output:
   10 is greater than 5
 */