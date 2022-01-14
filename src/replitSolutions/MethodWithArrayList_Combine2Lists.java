package replitSolutions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MethodWithArrayList_Combine2Lists {
    public static void main(String[] args) {

        ArrayList<String> wordList1 = new ArrayList<>(Arrays.asList("Orange","Grape","Apple", "Pear", "Kiwi"));
        ArrayList<String> wordList2 = new ArrayList<>(Arrays.asList("Watermelon","Lychee", "Pineapple"));
        ArrayList<String> combine2Lists = combine2Lists(wordList1, wordList2);
                //new ArrayList<>();
        System.out.println(combine2Lists);

    }


    public static ArrayList<String> combine2Lists(ArrayList<String> wordList1, ArrayList<String> wordList2) {

        ArrayList<String> combine2Lists = new ArrayList<>();

        // combine2Lists.addAll(wordList1);
        //combine2Lists.addAll(wordList2);

        for (String each: wordList1) {
            combine2Lists.add(each);
        }
        for (String each: wordList2) {
            combine2Lists.add(each);
        }
        return combine2Lists;


    }
}