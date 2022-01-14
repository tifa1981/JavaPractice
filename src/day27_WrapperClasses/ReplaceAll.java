package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 30, 40, 30, 30, 30};
        arr = replaceAll(arr,30,300);
        System.out.println(Arrays.toString(arr));
        String [] cars= {"Lexus","Kia","Toyota","BMW","Kia"};
        cars = replaceAll(cars,"Kia","Honda");
        System.out.println(Arrays.toString(cars));
    }



    //replace all of matching old value of the array, returns a new array with new value
    public static int[] replaceAll(int[] array, int oldValue, int newValue){

        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldValue){
                array[i] = newValue;
            }

        }
        return array;
    }
    //replace all of matching old value of the array, returns a new array with new value
    public static double[] replaceAll(double[] array, double oldValue, double newValue){

        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldValue){
                array[i] = newValue;
            }

        }
        return array;
    }
    //replace all of matching old value of the array, returns a new array with new value
    public static char[] replaceAll(char[] array, char oldValue, char newValue){

        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldValue){
                array[i] = newValue;
            }

        }
        return array;
    }
    //replace all of matching old value of the array, returns a new array with new value
    public static String[] replaceAll(String[] array, String oldValue, String newValue){

        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldValue){
                array[i] = newValue;
            }

        }
        return array;
    }
}




/*
2. ReplaceAll Task:
        2.1 Create a method named replace that passes three parameters: integer array, integer oldElement, integer newElement.
        The method replaces all the element of the array that matching with the given old element with the given new element, and returns the new array.
            Ex:
                arr = {10, 10, 20, 30, 40, 30, 30, 30};

                replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}
 */