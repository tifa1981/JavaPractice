package ExtraPractice;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {


        ArrayList<String> grocerylist = new ArrayList<>();  // the initial value of the arraylist is 0 by default
        //  add(element): adds the element into the arraylist,the size of the list increased by 1
        System.out.println(grocerylist.size());
        System.out.println("=============================");
        grocerylist.add("Banana");
        grocerylist.add("Apple");
        grocerylist.add("Cheese");
        grocerylist.add("Soy Sauce");
        grocerylist.add("Salt");
        grocerylist.add("Sugar");
        System.out.println(grocerylist);
        System.out.println("========================================");

        // size(): returns the total number of elements of the ArrayList, return type is int
        System.out.println(grocerylist.size());
        System.out.println("===========================");

        // get(index): returns the element at the given index from the ArrayList
        System.out.println(grocerylist.get(1));
        System.out.println("====================================");

        // set(index, newElement): replace the element of the ArrayList at given index to the new element- similar to String replace() method
        grocerylist.set(1,"eggs");
        System.out.println(grocerylist);
        System.out.println("===================================");

        // remove(int index): removes the element at the given index from the ArrayList
        grocerylist.remove(3);
        System.out.println(grocerylist);
        System.out.println("==============================");

        // remove(Object): removes the given object from the ArrayList(it will only remove the first matching object ), and returns boolean.

        boolean r3 = grocerylist.remove("Banana");
        System.out.println(grocerylist);
        System.out.println(r3);
        System.out.println("==============================");

        // clear(): removes all the objects from the ArrayList, size will be set to 0.
        grocerylist.clear();
        System.out.println(grocerylist);
        System.out.println("===============================");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(20);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(10);

        // indexOf(element): returns the index number of the first matching element from the Arraylist, return type is int
        int b= numbers.indexOf(20);
        System.out.println(b);
        System.out.println("=============================");

        // lastIndexOf(element):returns the index number of the last matching element from the ArrayList, return type is int
        int c= numbers.lastIndexOf(20);
        System.out.println(c);
        System.out.println("======================");





         // contains(element): check if the Arraylist contains the given element, return type is boolean

        boolean r1 = grocerylist.contains("Apple");

        System.out.println(r1);
        System.out.println("==========================================");

        // equals(list): check if the Arraylist is equal to another given list, return type is boolean.

        ArrayList<String> items = new ArrayList<>();  // this ArrayList is empty by default
        items.add("Banana");
        items.add("Apple");
       items.add("Cheese");
        items.add("Soy Sauce");
        items.add("Salt");
        items.add("Sugar");
        boolean r2 = items.equals(grocerylist);
        System.out.println(r2);
        System.out.println("==================================");

        // isEmpty(): checks if the ArrayList is empty(size is 0), return type is boolean

        boolean r4 = grocerylist.isEmpty();
        System.out.println(r4);

    }

}
