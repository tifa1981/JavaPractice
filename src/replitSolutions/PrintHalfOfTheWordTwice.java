package replitSolutions;

import java.util.Scanner;

public class PrintHalfOfTheWordTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println(word.substring(0,word.length()/2)+word.substring(0,word.length()/2));






    }
}


/*
Write a program that will print out first half of the word twice.

Example:

input: java

output: jaja
input: java

output: jaja
input: unity

output: unun
 */