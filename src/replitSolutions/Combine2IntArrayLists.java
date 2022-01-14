package replitSolutions;

import java.util.ArrayList;
import java.util.Arrays;

public class Combine2IntArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> numbersOne = new ArrayList<>(Arrays.asList(4, 3, 4, -3, 14));
        ArrayList<Integer> numbersTwo = new ArrayList<>(Arrays.asList(5, 13, 40, -89, 24));
        System.out.println(combineAL(numbersOne,numbersTwo));
    }

    public static ArrayList<Integer> combineAL(ArrayList<Integer> numbersOne,ArrayList<Integer>numbersTwo){
        ArrayList<Integer> combineAL = new ArrayList<>();
        for (Integer each : numbersOne) {
            combineAL.add(each);
        }
        for (Integer each : numbersTwo) {
            combineAL.add(each);
        }
        return combineAL;

    }
}
/*
Create a static method that:

is called combineAL
returns an ArrayList<Integer>
takes two parameters: an ArrayList of numbers called numbersOne, and another ArrayList of numbers called numbersTwo
This method should create a new ArrayList of Integer, add all the numbers (in order) from numbersOne,
then add all the numbers (in order) from numbersTwo. In other words, it is combining all the elements from the two lists.
 */