package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aaabcccdeeef";

        // convert String into array
        String[] arr= str.split("");
      //  System.out.println(Arrays.toString(arr));

       // convert array into an ArrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr)); // must pass collection type data into the() so that we can use collections methods to process the data
        System.out.println("list = " + list);

        String unique ="";

        for (String each : list) {
           int frquency = Collections.frequency(list,each);
           if(frquency==1){
               unique+=each;
           }

        }
        System.out.println("unique = " + unique);




    }
}
