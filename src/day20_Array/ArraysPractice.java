package day20_Array;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        // store data teh elements: 10,20,30,40

        int [] number ={10,20,30,40}; // size:4
        System.out.println(Arrays.toString(number));
        System.out.println("------------------------------");

        // create a variable can store 5 scores

        int[] scores = new int[5];
        System.out.println(Arrays.toString(scores));// print default value of 0, because we didn't assign any value in the array
        System.out.println("--------------------------------------------");
        scores[1]=85;
        scores[4]=90;  // it can be coded as scores[scores.length-1 to get the last index of the array list]
        scores[3]=60;
        scores[0]=63;
        scores[2]=88;
        System.out.println(Arrays.toString(scores));

        String [] days = {"Monday","Tuesday","Wednesday", "Thursday","Friday","Saturday","Sunday"};// use length-1 to get the last index
        //index:  0         1           2             3          4       5        6

        for (int i = 0; i < days.length ; i++) { // i= index numbers of array starting from 0

            System.out.println(days[i]);
        }
        System.out.println("-------------------------");
        for (int i = days.length-1; i >=0 ; i--) { // i= index numbers of array starting from days.length-1
            System.out.println(days[i]);
            System.out.println("--------------------------------------");

        }

    }
}
