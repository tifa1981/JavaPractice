package day20_Array;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        // using "new" keyword to create an array with 5 items without knowing what items are


        String [] myGroup;
        myGroup = new String[5]; // index 0~4
        System.out.println(myGroup); // this will give you error called hashcode. in order to print an array,
                                    // you need to import array util class as shown below
        System.out.println("------------------------");
        System.out.println(Arrays.toString(myGroup));// default value of String is null(stands for no value is given)

        myGroup[0] = "Tifa";
        myGroup[1] = "Nawar";
        myGroup[2] = "Waleed";
        myGroup[3] = "Lido";
        myGroup[4] = "Jordon";
        System.out.println(Arrays.toString(myGroup)); // it will print the values after you assign them to the array

        //myGroup[5] = "Muhtar";
       // myGroup[-1] = "Adam";
        // result of the above will be"Index 5 out of bounds for length 5"



        System.out.println("------------------");

        int [] names = new int[5];
        System.out.println(Arrays.toString(names));  // default value of int,short,long is 0
        System.out.println("-----------------");

        // use = to assign value to each element of array list


        double[] teams = new double[6];
        System.out.println(Arrays.toString(teams)); // default value of double, float is 0.0
        System.out.println("--------------------");

        // we can assign the values directly in the array when they are known to us, as shown below
        // each element of the array has an index
        String [] days = {"Monday","Tuesday","Wednesday", "Thursday","Friday","Saturday","Sunday"};
                  //index:  0         1           2             3          4       5        6


        System.out.println(Arrays.toString(days));

        // days[7] = "Javaday"; we can reassign value to the existed array like we do in String

        int number = 5;

        if(number<1 || number>7){
            System.out.println("Invalid number");
            System.exit(0);
        }
        System.out.println(days[number-1]); // prints "Friday" which is index 4( int number = , 5-1 = 4)






    }
}
/*
if you initialize array variable like this:
 array = {1,2,3,4,5...}
 the size will be set automatically , if you need to set the size manually then you need to initialize your array like this:
 array = new dataType[length]

 */