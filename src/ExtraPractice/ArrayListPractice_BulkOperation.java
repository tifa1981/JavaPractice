package ExtraPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice_BulkOperation {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        // 1. containsAll(collectionType): check if the ArrayList contains all the given collection of value, return type is boolean.

       ArrayList<Integer> list = new ArrayList<>(numbers);

        boolean r1= numbers.containsAll(Arrays.asList(10,20,30,40));
        System.out.println(r1);
        System.out.println("===============================");

        // as long as one of the elements in the collection is not found in the arraylist, the boolean result is false
        boolean r2= numbers.containsAll(Arrays.asList(10,20,30,40,100));
        System.out.println(r2);
        System.out.println("==================================");

        // 2.addAll(collectionType): adds all the given collection of values to the arrayList
        System.out.println(numbers);

        numbers.addAll(Arrays.asList(70,80,90,100));

        System.out.println(numbers);
        System.out.println("===========================");

        // 3. removeAll(collectionType): remove all the matching values from the ArrayList

        numbers.removeAll(Arrays.asList(50,10,60));
        System.out.println(numbers);
        System.out.println("===============================");

        // 4. retainAll(collectionType): remove all the un-matching values from the ArrayList( keeps the matching values only)

        numbers.retainAll(Arrays.asList(70,80,90,100));
        System.out.println(numbers);






    }
}
