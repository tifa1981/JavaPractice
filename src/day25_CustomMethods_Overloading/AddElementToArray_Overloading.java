package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementToArray_Overloading {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        numbers = addElement(numbers,7);
        System.out.println(Arrays.toString(numbers));


        System.out.println("------------------------------");

        String[] names = {"Tatiana", "Oleksandr", "Cassandra", "Ali"};  //"Neira"

        names =addElement(names,"Neira" );  //{"Tatiana", "Oleksandr", "Cassandra", "Ali", "Neira"}

        System.out.println(Arrays.toString(names));

        System.out.println("--------------------------------------");


    }


    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i] = each;     // result[i++]= each;
            i++;

        }
        result[i] = element;
        return result;

    }

    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i] = each;
            i++;

        }
        result[i] = element;  // element need to be assigned to the last index ( result[result.length-1]=element)
        return result;

    }

    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i] = each;     // result[i++]= each;
            i++;

        }
        result[result.length - 1] = element;
        return result;


    }

    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;
    }
}