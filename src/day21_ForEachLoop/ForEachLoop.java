package day21_ForEachLoop;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50,60,70};

        for (int i = 0; i < numbers.length; i++) {  //i: indexes of the array, so if you need to get the index of the array,
                                                   // you must use for loop to do it. can never use for each loop to get index.
            int eachElement = numbers[i];
            System.out.println(eachElement);

        }
        System.out.println("-------------------------------");

        // data type must be the same as of the data structure
        for(int each:numbers){
            System.out.println(each);

        }
        System.out.println("-----------------------------------------");




    }
}
/*
notes:
1. conditions for using for each loop:
1) used to access each element of a data structure
2) there must be a data structure(array, collection or map) to use for each loop
3) iteration times and orders are fixed, thus no need to worry about the infinite loop like for loop.
4) doesn't have index numbers
in a nutshell, for each loop is very handy and usful when we process data structures.
it is the fastest way to get the elements of an array we need.
but it doesn't mean we dont need other tpye of loops which is more powerful and flexible.

 */