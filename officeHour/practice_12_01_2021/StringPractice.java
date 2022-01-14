package practice_12_01_2021;

public class StringPractice {
    public static void main(String[] args) {
        String str = "Cydeo";

        if(str.length()>2){
            str = ""+str.charAt(str.length()-2) +str.charAt(str.length()-1);
        }
        System.out.println(str.repeat(3));
/*
        String str2="Cydeo";
        str2=str2.substring(str2.length()-2).repeat(3);
        System.out.println(str2);
        */




    }
}
/*
2. Create a method print a new string made of 3 copies of the last 2 chars of the original string.
The string length will be at least 2.
 */