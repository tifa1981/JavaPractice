package replitSolutions;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsWithArrayList_Add_Insert {
    public static void main(String[] args) {
        //instead of .add() taking one parameter(the thing we want to add), this time, we will be giving it two parameters.
        // the two parameters are:
        // .add(i, element)
        // i ==> the index you want to insert at
        // element ==> the element you want to insert at the index i


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4,2,5,6));
        numbers.add(1,100);
        System.out.println(numbers);
        System.out.println("===============================================");

        numbers.add(2,77);
        System.out.println(numbers);
        System.out.println("==============================================");

        ArrayList<String> words = new ArrayList<>(Arrays.asList("Hello","good morning", "How are you doing?" , "Bye!"));
        words.add(0,"hey");
        System.out.println(words);
        System.out.println("=============================================");

        words.add(2,"yo");
        System.out.println(words);
        System.out.println("==============================================");

    }
}
