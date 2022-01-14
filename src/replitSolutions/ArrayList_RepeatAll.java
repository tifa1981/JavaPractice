package replitSolutions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_RepeatAll {
    public static void main(String[] args) {
        ArrayList<Boolean> list = new ArrayList<>(Arrays.asList(true, false, false));

        System.out.println(repeatAll(list));
    }

    public static ArrayList<Boolean> repeatAll(ArrayList<Boolean> list){
       // list.addAll(list);

       int count = list.size();
        for (int i = 0; i < count; i++) {
            list.add(list.get(i));

        }

        return list;
    }

}


/*
Create a static method that:

is called repeatAll
returns ArrayList of Booleans
takes in a single parameter - an ArrayList of Booleans
This method should modify its ArrayList parameter by repeating its ArrayList values.

For example, if the parameter is
(true, false, false)
The modified ArrayList should be

(true, false, false, true, false, false)
 */