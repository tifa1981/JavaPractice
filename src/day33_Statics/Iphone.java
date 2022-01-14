package day33_Statics;

public class Iphone {

    public static String brand = "Apple";
    public static String OS = "iOS";
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean hasFaceTime = true;

    public String model;

    public double price;

    public String color;

    public String size;

    public static void printOperatngSystem(){
        // you don't need to create an object to be able to call static method
        System.out.println(OS);
    }


}


