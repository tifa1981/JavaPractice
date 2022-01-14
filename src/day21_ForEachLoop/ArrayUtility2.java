package day21_ForEachLoop;

import java.util.Arrays;

public class ArrayUtility2 {
    public static void main(String[] args) {

        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};
        String[] earlyBirds = Arrays.copyOf(students, 2);

        System.out.println(Arrays.toString(earlyBirds));

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        // copyOf method copies the elements in an array always starting from the first element (0) till the newLength was given
        // can  be reassigned back to the original array after making a copy

        numbers = Arrays.copyOf(numbers, 4); //{1,2,3,4,5}

        System.out.println(Arrays.toString(numbers));


        System.out.println("--------------------------------------------");

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        // copyOfRange method is similar to substring method in String, it copies the array from begining index was given and
          // ends at ending index was given( *but the ending index in a copyOfRage and substring is always excluded*)
        char[] ch2 = Arrays.copyOfRange(ch1, 2, 6+1 );

        System.out.println(Arrays.toString(ch2));

       int[] scores = {10,20,30,40,50,60,70,80,90,100};
       int[] result = Arrays.copyOfRange(scores,3,8);
        System.out.println(Arrays.toString(result));





    }
}
