package ExtraPractice;

public class WrapperClass {
    public static void main(String args[]) {

        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40;
        float f = 50.0F;
        double d = 60.0D;
        char c = 'a';
        boolean b2 = true;

        //Autoboxing: Converting primitives into objects
        Byte byteObj = b;
        Short shortObj = s;
        Integer intObj = i;
        Long longObj = l;
        Float floatObj = f;
        Double doubleObj = d;
        Character charObj = c;
        Boolean boolObj = b2;

        //Printing objects
        System.out.println("---Printing object values---");
        System.out.println("Byte object: " + byteObj);
        System.out.println("Short object: " + shortObj);
        System.out.println("Integer object: " + intObj);
        System.out.println("Long object: " + longObj);
        System.out.println("Float object: " + floatObj);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Character object: " + charObj);
        System.out.println("Boolean object: " + boolObj);

//Unboxing: Converting Objects to Primitives
        byte bytevalue = byteObj;
        short shortvalue = shortObj;
        int intvalue = intObj;
        long longvalue = longObj;
        float floatvalue = floatObj;
        double doublevalue = doubleObj;
        char charvalue = charObj;
        boolean boolvalue = boolObj;

        //Printing primitives
        System.out.println("---Printing primitive values---");
        System.out.println("byte value: " + bytevalue);
        System.out.println("short value: " + shortvalue);
        System.out.println("int value: " + intvalue);
        System.out.println("long value: " + longvalue);
        System.out.println("float value: " + floatvalue);
        System.out.println("double value: " + doublevalue);
        System.out.println("char value: " + charvalue);
        System.out.println("boolean value: " + boolvalue);

//  parseInt(),parseDouble() etc vs valueOf()

        //Integer num=new Integer(300);
        Integer num3 = Integer.valueOf(300);   // return Object
        int num2 = Integer.parseInt("123");  // return primitives
        System.out.println("num3 : " + num3);

        // - WrapperClassMethods
        System.out.println("=================");
        System.out.println(Integer.max(5, 4));
        System.out.println("Integer.min(5,4) = " + Integer.min(5, 4));
        System.out.println("Integer.sum(5,4) = " + Integer.sum(5, 4));

        System.out.println(Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);

        System.out.println("Integer.compare(5,4) = " + Integer.compare(5, 4));
        System.out.println("Integer.compare(5,5) = " + Integer.compare(5, 5));
        System.out.println("Integer.compare(4,5) = " + Integer.compare(4, 5));

        System.out.println("Character.isDigit('4') = " + Character.isDigit('4'));
        System.out.println("Character.isAlphabetic('0') = " + Character.isAlphabetic('0'));
        System.out.println("Character.isLetter('r') = " + Character.isLetter('r'));
    }
}
