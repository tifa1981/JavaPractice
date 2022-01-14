package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,10,8,5,5,2,2,4,2,1));
        Collections.sort(list);
        System.out.println(list);

        System.out.println("===================");

        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('a','b','c','d','r','u'));
        Collections.reverse(list2);
        System.out.println(list2);

        System.out.println("========================");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10,90,10,80,50,50,2,20,40,20,10));
        System.out.println("list3 = " + list3);
        System.out.println("====================");
        Collections.swap(list3,4,1);
        System.out.println("list3 = " + list3);
        System.out.println("==========================");

        int max = Collections.max(list3);
        int min = Collections.min(list3);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("========================");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10));
        int frequency = Collections.frequency(list4, 1000 );

        System.out.println("frequency = " + frequency);

        System.out.println("-------------------------------------");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java","Python","Jack","Jade","Java","Python","C#"));

        int countJava =Collections.frequency(words, "Java");
        int countPython =Collections.frequency(words, "Python");
        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);



    }
}
