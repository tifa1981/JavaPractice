package utilities;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUtility {



//Write a method that can sort the ArrayList in descending order without using the sort method
    public static void SortingArrayListDesc(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) > list.get(j)) {

                    Integer temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);

                }

            }

        }

    }

//Write a method that can sort the ArrayList in Ascending order without using the sort method
    public static void SortingArrayListAsc(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) < list.get(j)) {

                    Integer temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);

                }

            }

        }

    }
// combine 2 arraylists and return a new arraylists
    public static ArrayList<String> combine2Lists(ArrayList<String> wordList1, ArrayList<String> wordList2) {

        ArrayList<String> combine2Lists = new ArrayList<>();

        // combine2Lists.addAll(Arrays.asList(wordList1));
        //combine2Lists.addAll(Arrays.asList(wordList2));

        for (String each: wordList1) {
            combine2Lists.add(each);
        }
        for (String each: wordList2) {
            combine2Lists.add(each);
        }
        return combine2Lists;


    }





}
