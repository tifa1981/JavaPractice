package day20_Array;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        char ch = 'z';
        char[] letters = new char[26];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = ch--;

        }
        System.out.println(Arrays.toString(letters));


      //  char[] letters = new char[26];
        //letters[26]= 'z';
        //letters[25]= 'y';
        //.....

      /*  for (char i = 'A', j=0; i <= 'Z' && j< letters.length; i++,j++) {

           letters[j]=i;
            }
        System.out.println(Arrays.toString(letters));
        */
//        char ch = 'A';
//        for (int i = 0; i < letters.length; i++, ch++) {
//            letters[i] = ch;
//
//        }
////        System.out.println(Arrays.toString(letters));
////
     char ch2 = 'z';
     char[] letters2 = new char[26];  //[z~a]
////

////        for (int i = 26 - 1; i >= 0; i--) {
//            letters2[i] = ch2--;
//
//
//            System.out.print(letters2[i] + " ");
//
//        }
////        System.out.println();

        for (int i = 0; i <letters2.length; i++,ch2--) {
            letters2[i] = ch2;

        }
        System.out.println(Arrays.toString(letters2));


    }
}







