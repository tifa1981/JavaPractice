package day21_ForEachLoop;

import java.util.Arrays;

public class ArrayUtility {
    public static void main(String[] args) {

        int[] nums ={1,2,3,4,5};
        System.out.println(nums); // it will print hashcode
        System.out.println("-----------------------------");

        System.out.println(Arrays.toString(nums)); // must call Array.toString to print the whole array.
        System.out.println("---------------------");

        System.out.println(nums[0]);   // no need to call Array.toString when only print certain element in the Array.
        System.out.println("-------------------------------------");

        int[] scores={100, 90, 70, 96, 88};
        System.out.println(Arrays.toString(scores));
        System.out.println("----------------------");

        // to sort it out in order
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("---------------");

        System.out.println("Min Score: " + scores[0]);
        System.out.println("Max Score: " + scores[scores.length-1]);
        System.out.println("---------------------------");

        String [] names = {"Tifa", "Duraid", "Maria", "Ahmet","Zain"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names)); // it will print the names in ascending order(small to larger) based on the alphabets (which have numbers
                                                     // assigned to them on ASCII table)

        System.out.println("-----------------------------------------------");

        int[] arr1 = {1,3,2};
        int[] arr2 = {1,2,3};

        boolean r1 = Arrays.equals(arr1,arr2);

        System.out.println(r1);

        Arrays.sort(arr1); //{1,2,3}
        Arrays.sort(arr2);//{1,2,3}

        boolean r2 = Arrays.equals(arr1, arr2);

        System.out.println(r2);

        System.out.println("-----------------------------------------------------");
        //"acb" , "bac"
        char[] ch1 = {'a', 'c', 'b'};
        char[] ch2 = {'b', 'a', 'c'};

        Arrays.sort(ch1); //{a, b, c}
        Arrays.sort(ch2); //{a, b, c}

        boolean anagram = Arrays.equals(ch1, ch2);

        System.out.println("anagram = " + anagram);


    }
}
/*
equals(array1, array2): checks if two arrays are equal, returns boolean

		copyOf(array, newLength)

Anagram:
	 listen    silent
	 heart	   earth
 */