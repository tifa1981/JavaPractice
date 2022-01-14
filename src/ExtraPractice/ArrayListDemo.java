package ExtraPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {

        // Remove the first two elements in an ArrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Orange", "Kiwi", "Orange", "Kiwi"));

        // solution 1: using remove() method
        list.remove(0);
        System.out.println(list);
        System.out.println("================================");

        list.remove(0);
        System.out.println(list);
        System.out.println("=====================================");

        // solution 2: removing elements by value
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Apple", "Orange", "Kiwi", "Orange", "Kiwi"));
        String firstElement = list2.get(0);
        String secondElement = list2.get(1);

        list2.remove(firstElement);
        list2.remove(secondElement);

        System.out.println(list2);


    }
    }


