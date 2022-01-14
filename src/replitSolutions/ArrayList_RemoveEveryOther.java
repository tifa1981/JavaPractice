package replitSolutions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_RemoveEveryOther {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>(Arrays.asList("hi", "yo", "sup", "yolo", "book"));
        System.out.println(removeEveryOther(words));
    }


    public static ArrayList<String> removeEveryOther(ArrayList<String> words) {


        ArrayList<String> newList = new ArrayList<String>();
        for (int i = 0; i < words.size(); i++) {
            if (i % 2 == 0) {
                newList.add(words.get(i));
            }
        }
        words.removeAll(newList);
        return words;
    }

}

/*
Create a method that:

is called removeEveryOther
returns ArrayList of Strings
takes in a single parameter - an ArrayList of Strings called words
This method should take the ArrayList parameter and modify it by removing every other element in the list,
starting with removing the 0th element.
For example, if the parameter is:

("hi","yo","sup","yolo","book")
("hi","yo","sup","yolo","book")
The modified ArrayList should be:

("yo","yolo")
 */