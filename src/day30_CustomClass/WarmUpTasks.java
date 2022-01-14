package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
       numbers.addAll(Arrays.asList(10,9,10,8,5,5,2,2,4,2,1));
        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);
        System.out.println("================================");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println(list);

        int size = list.size();  // create an empty arraylist to store data
        list.removeAll(Arrays.asList(0));  // remove all the 0s
        System.out.println(list);

        int newSize = list.size();
        int totalNumberOfZeros = size - newSize;
        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros);
        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);

        }
        System.out.println(list);
        System.out.println("=================================================");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        // create a new arraylist to store data
        ArrayList<Integer> newList = new ArrayList<>();  // ArrayList is 0 when first initialized

        for (Integer each : list2) {
            if(each !=0){
                newList.add(each);
            }

        }
        for (Integer each : list2) {
            if(each == 0){
                newList.add(each);
            }
        }

        System.out.println(newList);
        System.out.println("========================");

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> chars = new ArrayList<>();  // create an arraylist contains all the chars in the String str
        for (int i = 0; i < str.length(); i++) {
           chars.add(str.charAt(i)); // add all the chars from the str into a new arraylist

        }
        ArrayList<Character> letters = new ArrayList<>(chars);
        System.out.println(letters);
        System.out.println("==========================================================================");
        letters.removeIf(p-> !Character.isLetter(p));  // remove the chars that are not letters
        System.out.println("letters = " + letters);

        ArrayList<Character> digits = new ArrayList<>(chars);
        digits.removeIf(p-> !Character.isDigit(p));  // remove the chars that are not digits
        System.out.println("digits = " + digits);


        ArrayList<Character> specialChars = new ArrayList<>(chars);
        // specialChars.removeAll(letters);
        // specialChars.removeAll(digits);
        specialChars.removeIf(p-> Character.isLetterOrDigit(p));

        System.out.println("specialChars = " + specialChars);
    }
}
/*
1. write a program that can swap the first and last elements of an ArrayList of Integers

2. Write a program that can move all the zeros to the last indexes of ArrayList

                    Ex:
                        list: {1,0,2,0,3,0,4,0}

                    output:
                        [1, 2, 3, 4, 0, 0, 0, 0]


3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}
 */