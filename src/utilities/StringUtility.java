package utilities;

import java.util.Arrays;

public class StringUtility {

    // remove mddle Char from a String
    public static String removeCharAt(String s, int position) {
        return s.substring(0, position) + s.substring(position + 1);
    }
    //prints each character of the given string
    public static void printEachChar(String str) {


        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }

    //reverses the given string and returns the reversed string
    public static String reverse(String str) {
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    //checks if the given String is palindrome, returns boolean
    public static boolean isPalindrome(String str){
        return reverse(str).equalsIgnoreCase(str);
    }
   // checks if the given string is anargram, returns boolean.
   public static boolean anagram (String str1, String str2){
        char[] ch1= str1.toCharArray();
        char[] ch2= str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

       return Arrays.equals(ch1,ch2);

   }
    //removes the duplicates from given string, returns String.
    public static String removeDuplicates(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(!result.contains(""+each)){
                result += each;
            }

        }

        return result;
    }

    //1. create a return method called addInteger that can add an Integer  after the  last index of an integer array
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length + 1];

        int i =0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }


    //2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length + 1];

        int i =0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    //3. create a return method called addString that can add a String after the last index of a String array
    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length + 1];

        int i =0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    //4. create a return method called addChar that can add a char after last index of a char array
    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length + 1];

        int i =0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


}
