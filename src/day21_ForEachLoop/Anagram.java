package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="acdb";
        String str2="dbca";
        // write a program that can check if str1 and str2 are built out of the same character

        char[] chars1= str1.toCharArray();
        char[] chars2= str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        boolean anagram= Arrays.equals(chars1,chars2);
        System.out.println("anagram = " + anagram);



    }
}
