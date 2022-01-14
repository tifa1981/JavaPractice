package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        // .add is to add data after the last index of the ArrayList
        numbers.add(10);
        System.out.println(numbers);

        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println(numbers);

        // add data  to the given index
        numbers.add(3,25);
        System.out.println(numbers);
        System.out.println(numbers.size());  // print the length of the array

        int lastIndex = numbers.size()-1;
        System.out.println("lastIndex = " + lastIndex);
    }
}
