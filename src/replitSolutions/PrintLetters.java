package replitSolutions;

import java.util.Scanner;

public class PrintLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);

        int i = start;
        int j = end;
        String result = "";

        for (int k = i; k <=j ; k++) {
            result = ""+(char)k;
            System.out.print(result);

        }



        }
    }

/*
Write a program that will print out letters in the alphabetic order accordingly to the given range within 2 chars.

Example:
input:
A
Z
output: ABCDEFGHIJKLMNOPQRSTUVWXYZ
Example:
input:
a
f
output: abcdef
Example:
input:
B
O
output: BCDEFGHIJKLMNO
 */