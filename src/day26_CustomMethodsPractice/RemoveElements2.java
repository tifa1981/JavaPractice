package day26_CustomMethodsPractice;

import utilities.ArrayUtility;

public class RemoveElements2 {











    // removes the index from the array, returns a new array
    public static int[] removeElement(int [] array, int index){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);

        }
        int[] result = {};

        for (int i = 0; i < array.length; i++) {
            if( i!= index){
                result = ArrayUtility.addElement(result,array[i]);
            }

        }
        return result;
    }
}
