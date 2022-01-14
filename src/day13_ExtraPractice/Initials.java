package day13_ExtraPractice;

import java.util.Locale;

public class Initials {
    public static void main(String[] args) {
        String name = "cybertek school";

        String firstInitial = "" + name.toUpperCase().charAt(0);
        String secondInitial = "" + name.toUpperCase().charAt(name.indexOf(" ")+1);

        System.out.println("Initials are: " + firstInitial+"."+secondInitial);


    }
}
