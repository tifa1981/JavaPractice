package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "123";

        int num = Integer.parseInt(str); // parse String into int

        System.out.println(num+1);   //1234
        System.out.println(str+1);  // 1231

        System.out.println("--------------------");

        String str2 = "10.5";

        double num2 = Double.parseDouble(str2); // double
        System.out.println(num2+1);  // 11.5
        System.out.println(str2+1);   // 10.51

        int max = Integer.MAX_VALUE;  // MAX.VALUE is not a method, just a variable for max function
        int min = Integer.MIN_VALUE;

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        long max1= Long.MAX_VALUE;
        long min1 = Long.MIN_VALUE;

        System.out.println("min1 = " + min1);
        System.out.println("max1 = " + max1);

        String s1 = "true";
        boolean r1 = Boolean.parseBoolean(s1);
        System.out.println(r1);

        // valueOf method converts any given String into wrapper class

        String s2 = "123";
        Integer x = Integer.valueOf(s2);  // Integer
        System.out.println(x);

        int y = Integer.valueOf(s2);  //Integer, returns wrapper class
        System.out.println(y);
        System.out.println("----------------------------");

        //isDigit()

        char ch1 = '0';
        boolean r2 = Character.isDigit(ch1);
        System.out.println(r2);
        System.out.println("-------------------------------------");

        // isLetter
        char ch2 = 'A';
        boolean r3 = Character.isLetter(ch2);
        System.out.println(r3);

        char ch3='@';
        boolean r4 = Character.isLetterOrDigit(ch3);
        System.out.println(r4);

        System.out.println("===============================");

        String str3 = "abs78jiakm9";
        char [] arr = str3.toCharArray();

        int sum = 0;
        for (char each: arr) {
            if( Character.isDigit(each) ){
                sum +=  Integer.parseInt(""+each);
            }

        }

        System.out.println("sum = " + sum);


    }




    }

