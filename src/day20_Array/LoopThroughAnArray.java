package day20_Array;

import java.util.Arrays;

public class LoopThroughAnArray {
    public static void main(String[] args) {
        String [] cars= {"Lexus","Toyota","BMW","Kia"};
        System.out.println(cars.length);
        System.out.println("---------------");

        System.out.println(cars.length-1);
        System.out.println("----------------");

        System.out.println(Arrays.toString(cars));
        System.out.println("---------------------");

        System.out.println(cars[0]); // first element of array
        System.out.println("------------------------");

        //You can loop through the array elements with the for loop,
        // and use the length property to specify how many times the loop should run.
        //The following example outputs all elements in the cars array:
        for (int i = 0; i < cars.length; i++) {

            System.out.println(cars[i]);

        }
        System.out.println("--------------");

        char[] alphabets = new char[26]; // Z-A

    // loop with one variable
        char ch= 'Z';
        for (int i = 0; i < alphabets.length; i++,ch--) {
            alphabets[i]=ch;
        }
        System.out.println(Arrays.toString(alphabets));

        System.out.println("-----------------------");

        // loop with 2 variables, it can only declare 2 variavles with the same datatype like char as below

        for (char i = 0, j = 'z'; i < alphabets.length ; i++,j--) {
            alphabets[i]= j;

        }
        System.out.println(Arrays.toString(alphabets));



    }

}
