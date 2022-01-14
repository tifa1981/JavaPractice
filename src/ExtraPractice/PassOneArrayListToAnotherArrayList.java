package ExtraPractice;

import java.util.ArrayList;

public class PassOneArrayListToAnotherArrayList {
    public static void main(String[] args) {


       // Approach 1: Using the assignment operator(=) (the changes in the ArrayList will reflect on the other one )
 /*
In this approach, we will simply assign the first ArrayList reference to the second but there is one important aspect
to look at here we did not create a new object we simply pointed the second ArrayList to the first one.
So if you make a change in the first ArrayList it will reflect in the second one also because you are using
the same object. We can also change one value of one ArrayList and can look for the same in the other one whether it is changed or not.
         */

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(21);
        list.add(22);
        list.add(35);

        ArrayList<Integer> list2 = list;  // assigning the list to list2

        // iterating over list2

        for (Integer each : list2) {
            System.out.println(each);
        }
        // here we changed the third element to 23
        // we changed in second list and you can see the same change in the first Arraylist

        list2.set(2,23);
        System.out.println("third element of first list ="
                + list.get(2));
        System.out.println("third element of second list ="
                + list2.get(2));
        System.out.println("==========================================================================");

        //Approach 2: Passing in the constructor
        /*

In this approach, we will simply pass the first ArrayList in the second ArrayList’s constructor.
By using this approach if we change one ArrayList element/value it will not affect the other one,
so this is the approach where we actually created the duplicates.
 We can also change one value of one ArrayList and can look for the same in the other one whether it is changed or not.

         */
        // creation of ArrayList of Integers
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(21);
        list3.add(22);
        list3.add(35);

        // passing in the constructor
        ArrayList<Integer> list4 = new ArrayList<>(list3);

        // iterating over second ArrayList list4
        for (Integer each : list4) {
            System.out.println(each);
        }
        // here we changed the third element to 23
        // we changed in list4, and you can see that we will not see the same change in list3
        list4.set(2,23);
        System.out.println("third element of first list ="
                + list3.get(2));
        System.out.println("third element of second list ="
                + list4.get(2));
        System.out.println("==========================================================================");

        //Approach 3: Adding one by one using add() method
/*
In this approach, we will iterate over each element of the first ArrayList and add that element in the second ArrayList.
Here if you change first ArrayList element than it will not change the elements of the second ArrayList.
 We can also change one value of one ArrayList and can look for the same in the other one whether it is changed or not.
 */
        // creation of ArrayList of Integers
        ArrayList<Integer> list5 = new ArrayList<>();
        list5.add(10);
        list5.add(21);
        list5.add(22);
        list5.add(35);

        ArrayList<Integer> list6 = new ArrayList<>();

        // adding element to the second ArrayList - list6

        for (Integer each : list5) {
            list6.add(each);
        }
        System.out.println(list6);
        System.out.println("========================================================================");
        // Iterating over  second ArrayList - list6

        for (Integer each : list6) {
            System.out.println(each);
        }
        System.out.println("=========================================================================");
        // here we changed the third element to 23
        // the change we made in second list here,we will not see the same change in the first list

        list6.set(2,23);
        System.out.println("third element of first list ="
                + list5.get(2));
        System.out.println("third element of second list ="
                + list6.get(2));








    }
}




/*
It is the implementation class of List Interface.
It allows duplicates objects/elements and as well as maintains the insertion order.
You can get the element present inside the ArrayList by the index of it now you need to pass it into getting (index) method.
You can add the elements into ArrayList using the add() method.
 */