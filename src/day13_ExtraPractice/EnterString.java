package day13_ExtraPractice;
import java.sql.SQLOutput;
import java.util.Scanner;

public class EnterString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = scan.next();
        String result = "";
        if(str.length() ==0){
            result = "string is empty";
        }else if(str.length()>3){
            result = "str.length()-3" +"str.length()-2" + "str.length()-1";
        }else if(str.length() <=2 ){
            result = "str";
        }
        scan.close();

    }
}
/*
Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */