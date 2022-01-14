package ExtraPractice;

import java.util.Arrays;

public class Array_MultiplyShorter {
    public static void main(String[] args) {
        // index      0 1 2 3 4 5 6
        int[] arr1 = {1,2,3,4,5,6,7};
                   // 8 6 1 8 6 1 8
                  //[8, 12, 3, 32, 30, 6, 56] <= output
        //index       0 1 2 0 1 2 0
        int[] arr2 = {8,6,1};
       int[] products = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            products[i]= arr1[i] * arr2[i % arr2.length];
        }
        System.out.println(Arrays.toString(products));
    }

}
/*
you are given two int arrays. The second may be shorter than the first. Return a new array whose elements are the
products of the corresponding elements of the two given arrays. If the second array is shorter, repeat it as many as necessary.
e.g.:
arr1:[1,2,3,4,5] arr2:[8,6]
     [8,6,8,6,8]              ==>[8,12,24,24,40]

arr1:[4,8,1,2] arr2:[2,2,3,3]
     [2,2,3,3]                ==>[8,16,3,6]

 arr1:[5,9] arr2:[-2]
     [-2,-2]                ==>[-10,-18]
 */