package day25_CustomMethods_Overloading;

import utilities.ArrayUtility;

public class Test2 {

    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3, 4, 5};

        // ArraysUtility.
        ArrayUtility.printEachElement(arr1);

        System.out.println("--------------------------------");

        double[] arr2 = {1.5, 2.5, 3.5, 4.5};

        ArrayUtility.printEachElement(arr2);

        System.out.println("--------------------------------");

        char[] arr3 = {'A', 'B', 'C', 'D'};

        ArrayUtility.printEachElement(arr3);

        System.out.println("--------------------------------");

        String[] names = {"David", "Elvira", "Ali", "Igor"};

        ArrayUtility.printEachElement(names);
        System.out.println("------------------------------");

        int[] a1 = {1,2,3,4,5,6,7};
        boolean r1 = ArrayUtility.contains(a1,5);
        System.out.println(r1);


    }
}