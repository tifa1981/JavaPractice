package day14_String;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your words: ");
        String str = scan.nextLine();
        String result = "";

        if(str.length() == 5) {
            for (int i = str.length() - 1; i >= 0; i--) {
                result += "" + str.charAt(i);
            }
        }
        else if(str.length() < 5){
            result = "Too short!";
            }
         else{
             result = "Too long!";

            }

        System.out.println(result);
    }
}



/*
Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.
 */