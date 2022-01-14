package replitSolutions;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveTargetWords {

    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("ds","a","b","c","a","d"));
        System.out.println(removeAl(wordList,"a"));

    }
    public static ArrayList<String> removeAl(ArrayList<String> wordList, String targetWord){
    //    ArrayList<String> list = new ArrayList<>(wordList);

           wordList.removeAll(Arrays.asList(targetWord));



//        for (int i = 0; i < wordList.size(); i++) {
//
//            if(wordList.get(i).equals(targetWord)){
//                wordList.remove(i);
//                i--;
//            }
//
//        }
        return wordList;
    }

}
/*
Create a static method that:

is called removeAll
returns ArrayList<String>
takes two parameters: an ArrayList of Strings called wordList, and a String called targetWord

This method should go through every element of wordList and remove every instance of targetWord from the ArrayList.

Example:

ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));

removeAll(wordList,"hi");

wordList: ["hey","yo"]
 */