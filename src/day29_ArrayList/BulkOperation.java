package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //addAll ==> adds collection of values to the ArrayList

        list.addAll(Arrays.asList(1,2,3,4,3,3,3,5,6,7,8,8,8,8,5,5,5,5)); // asList(array of value) ==>returns the value as collection type

        System.out.println(list);

        list.removeAll(Arrays.asList(3,5,8)); //removes all the matching elements in an Arraylist
        System.out.println(list);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,800,900));

        numbers.retainAll(Arrays.asList(100,200,300)); // oppsite of removeAll method, is to keep the matching elements

        System.out.println(numbers);
        System.out.println("----------------------------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,5,3,8,4,10));
        boolean r1 = nums.containsAll(Arrays.asList(2,5,10)); // checks if all the elements are contained in the arraylist
        System.out.println("r1 = " + r1);

        System.out.println("====================");

        String[] names = {"Josh", "Jack", "Daniel", "Shay", "Breanna"};
        // it can only add the non-primitive data inside the collection
        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names)); // we can pass collection value in the ().

       /* ArrayList<String> namesList = new ArrayList<>();
        namesList.addAll(Arrays.asList(names));

        */
        System.out.println("namesList = " + namesList);
        System.out.println("====================================");

        int[] arr = {1,2,3,4,5,6,7,8,77,10};
       //  ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr)); ==> doesn't work this way!!!!!!!
        // use method to convert
        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr));
        System.out.println("list3 = " + list3);
        System.out.println("=================================");

        Integer [] arr2 = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));  // data type must be Class=>Integer
        System.out.println("list2 = " + list2);




    }
    public static ArrayList<Integer>  convertArrayToArrayList(int[] array) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int each : array) {
            list.add(each);

        }
        return list;
        }

}
