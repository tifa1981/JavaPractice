package replitSolutions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_RemoveInstance {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));
        System.out.println(removeInst(list, 4));
    }

    public static ArrayList<Integer> removeInst(ArrayList<Integer> list, Integer n){
       // list.removeAll(Arrays.asList(n));
        // list.removeIf(each -> each==n);
        for(int i=0; i<list.size();i++){
            if(list.get(i) ==n){
                list.remove(i);
                i--;
            }
        }
        return list;
    }
}


/*
This method gets an Arraylist of Integers and a number(Integer). It returns an Arraylist.

It removes any instance of the given number from the Arraylist.

Example:
romoveInst([1,1,2,3,1,4],1)
returns: [2,3,4]

romoveInst([3,4,3,3],4)
returns: [3,3,3]
 */