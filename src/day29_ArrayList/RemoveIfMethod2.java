package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod2 {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                list.contains(i);
            }

        }
        System.out.println(list);
        System.out.println("================");

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java","Python","Jack","Jade","C#"));
        list3.removeIf(p-> p.startsWith("J"));
        System.out.println(list3);

        System.out.println("=======================");

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Anna","Racercar", "level","eye","java","Cydeo","Python"));
        names.removeIf(name-> StringUtility.isPalindrome(name));
        System.out.println("names = " + names);


    }
}
