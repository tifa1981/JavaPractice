package day27_WrapperClasses;

import utilities.ArrayUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,3,6,6,8,8};
        arr= removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
        String [] cars= {"Lexus","Kia","Toyota","BMW","Kia"};
        cars = removeDuplicates(cars);
        System.out.println(Arrays.toString(cars));
    }



  // removes the duplicates from a given array, returns a new array
    public static int[] removeDuplicates(int[] array){
        int[] result = {};
        for (int eachElement : array) {
            if(!ArrayUtility.contains(result,eachElement)){
                result=ArrayUtility.addElement(result,eachElement);

            }

        }
        return result;
    }
    // removes the duplicates from a given array, returns a new array
    public static double[] removeDuplicates(double[] array){
        double[] result = {};
        for (double eachElement : array) {
            if(!ArrayUtility.contains(result,eachElement)){
                result=ArrayUtility.addElement(result,eachElement);

            }

        }
        return result;
    }
    // removes the duplicates from a given array, returns a new array
    public static char[] removeDuplicates(char[] array){
       char[] result = {};
        for (char eachElement : array) {
            if(!ArrayUtility.contains(result,eachElement)){
                result=ArrayUtility.addElement(result,eachElement);

            }

        }
        return result;
    }
    // removes the duplicates from a given array, returns a new array
    public static String[] removeDuplicates(String[] array){
        String[] result = {};
        for (String eachElement : array) {
            if(!ArrayUtility.contains(result,eachElement)){
                result=ArrayUtility.addElement(result,eachElement);

            }

        }
        return result;
    }

}
