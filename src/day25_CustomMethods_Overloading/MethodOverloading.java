package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class MethodOverloading {

    public static void main(String[] args) {

        int[] intArray = {5, 6, -1, 0, 3, 4};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println("----------------------------");

        double[] doubleArray = {10.5, 11.5, 5.5, 4.5};
        Arrays.sort(doubleArray);
        System.out.println(Arrays.toString(doubleArray));
        System.out.println("----------------------");

        char[] charArray = {'E', 'F', 'G', 'C', 'A'};
        Arrays.sort(charArray);
        System.out.println(Arrays.toString(charArray));
        System.out.println("--------------------------------");
        
       int sum=  sumOfNumbers(10,20);
        System.out.println("sum = " + sum);

        double sum1 = sumOfNumbers( 10,20.3);
        System.out.println("sum1 = " + sum1);

    }

        public static int sumOfNumbers(int num1, int num2){
            return  num1 + num2;
        }
        public static double sumOfNumbers(double num1, double num2){
          return num1 + num2;
    }
     public static double sumOfNumbers(int num1, double num2){
        return num1 + num2;
    }


        public static int sumOfNumbers(int num1, int num2,int num3){
            return num1+num2+num3;
        }
        public static int sumOfNumbers(int num1, int num2,int num3, int num4){
            return num1+num2+num3+num4;
        }









    
}
