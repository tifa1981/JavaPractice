package ExtraPractice;

import java.util.Arrays;

public class Merge3Arrays {
    public static void main(String[] args) {

        int[] arr1 = {30, 10, 20};
        int[] arr2 = {15, 40, 25, 35};
        int[] arr3 = {8, 9, 17, 5, 4, 1};

        //int[] merge = {arr1 , arr2 , arr3};
        String result = "[";
        for (int each : arr1) {
            result += each + ", ";
        }
        for (int each : arr2) {
            result += each + ", ";
        }
        for (int each : arr3) {
            if (each == arr3[arr3.length - 1]) {
                result += each + "";
            } else {
                result += each + ", ";
            }
        }
        System.out.println(result+"]");
    }

}


/*Write a program that can merge 3 arrays of integers

    		Ex:
    			arr1 = {30, 10, 20};
    			arr2 = {15, 40, 25, 35};
    			arr3 = {8, 9, 17, 5, 4, 1}

			Output:
				{30,10,20,15,40,25,35,8,9,17,5,4,1}   []

 */