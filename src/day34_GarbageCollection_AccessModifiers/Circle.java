package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class Circle {
    public double radius;
    public static double pi;
    public static String name;  // we can set this static variable in one step like this ==>public static String name = "Circle"

    public static ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10));
   //  numbers.add(10); can not be set in one step

    // public static Sheet sheet; ==> to get every data in an exel sheet ==> can not set the static variable in one step

    public Circle( double radius){
        this.radius=radius;
       // pi=3.14; this will not give you error, but not recommended.
    }
    static {
        //radius = 5   not allowed here
        pi=3.14;
        name = "Circle";
    }
}
