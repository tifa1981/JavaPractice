package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseArray {


    public static void main(String[] args) {
        int[] arr = {5,6,7,8};
        int[] result = reverse(arr);
        System.out.println(Arrays.toString(result));
    }
   // reverse the given array, returns a new array
    public static int[] reverse (int [] array){
        int[] result = new int[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {
            result[j] = array[i];

        }
        return result;
    }
}
