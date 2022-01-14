package ExtraPractice;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr1 = {30, 10, 20};
        int[] arr2 = {15, 40, 25, 35};
        int[] arr3 = {8, 9, 17, 5, 4, 1};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(i+", ");

        }
        System.out.println();

        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(i +", ");

        }
        System.out.println();
        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.print(i+", ");

        }

    }
}


/*
Write a program that sort the array of integer in descending order

 */