package ExtraPractice;

import java.util.Scanner;

public class FrontTimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();

        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        if(str.length()>=3){
            str = str.substring(0,3).repeat(num);
        }else{
            str = str.substring(0,2).repeat(num);
        }
        System.out.println(str);

    }
}


/*

Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is
there if the string is less than length 3. Return n copies of the front;


frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
 */