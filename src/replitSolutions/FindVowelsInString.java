package replitSolutions;

import java.util.Scanner;

public class FindVowelsInString {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();

        String vowels="aeiou";
        for (int i = 0; i < word.length(); i++) {
            if(vowels.contains(word.charAt(i)+"")){
                System.out.println(word.charAt(i));
            }

        }


    }
}
/*
Create a program that will take the given String In and print out all the vowels from the String.

Example:

Input: howdyho
Output: oo

Input: huehuehuehue
Output: ueueueue
 */