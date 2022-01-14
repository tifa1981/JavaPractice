package day14_String;
import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first string: ");
        String str1 = scan.nextLine();

        System.out.println("Enter your second string: ");
        String str2 = scan.nextLine();

        String result = "";

        if(str1.length() > str2.length()){
            result = str1;
        }else if(str2.length() > str1.length()){
            result = str2;
        }else{
            System.out.println("They both have the same length.");
        }
        System.out.println(result);
        scan.close();
    }
}

/*
 write a program that asks user to enter two strings, and print out the longest string
 */