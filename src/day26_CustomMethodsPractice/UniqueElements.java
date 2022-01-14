package day26_CustomMethodsPractice;

import utilities.ArrayUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {
        int[] array ={1,1,1,3,4,5,6,7,8,9,3,4};
        int[] unique = uniqueElements(array);
        System.out.println(Arrays.toString(unique));

        double[] array2 ={1.2,1.2,1.6,3.1,4.6,5.0,6.2,7.0,8.9,9.0,3.1,4.6};
        double[] unique2 = uniqueElements(array2);
        System.out.println(Arrays.toString(unique2));

        char[] array3 = {'A', 'A', 'A', 'B', 'C', 'C', 'D', 'D', 'D'};
        char[] unique3 = uniqueElements(array3);
        System.out.println(Arrays.toString(unique3));
    }





    // returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array){
        int[] result = {}; // new int[0]

        for (int each : array) {
            if(ArrayUtility.frequencyOfElement(array,each)==1){ // if the frequency is one, the elements is unique
                result=ArrayUtility.addElement(result,each);
            }

        }
        return result;
    }
    // returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array){
        double[] result = {}; // new int[0]

        for (double each : array) {
            if(ArrayUtility.frequencyOfElement(array,each)==1){ // if the frequency is one, the elements is unique
                result=ArrayUtility.addElement(result,each);
            }

        }
        return result;
    }
    // returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[] array){
        char[] result = {}; // new int[0]

        for (char each : array) {
            if(ArrayUtility.frequencyOfElement(array,each)==1){ // if the frequency is one, the elements is unique
                result=ArrayUtility.addElement(result,each);
            }

        }
        return result;
    }
    // returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[] array){
        String[] result = {}; // new int[0]

        for (String each : array) {
            if(ArrayUtility.frequencyOfElement(array,each)==1){ // if the frequency is one, the elements is unique
                result=ArrayUtility.addElement(result,each);
            }

        }
        return result;
    }






}
