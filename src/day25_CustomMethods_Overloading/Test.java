package day25_CustomMethods_Overloading;

import utilities.StringUtility;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
   /*     method3(50);
    }
    public static String method3(int num){
        if(num<0){
            return "Less than 0";
        }else if(num<50){
            return "Less than 50";
        }else if (num <100){
            return "Less than 100";
        }else {
            return "other";
        }
    }

    */
        String[] cities = {"Boston", "Houston", "Austin", "Lincoln", "Tulsa"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(cities));
        int a = list.size();
        for (String str : list) {
            String rev = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                rev += str.charAt(i);
            }
            //  System.out.println(rev);
              // notsoB
             // notsuoH
            //  nitsuA
            //  nlocniL
            // asluT

            list.set(--a, rev); //--a = 4

        }
        System.out.println(list);



      /*
       ArrayList<String> words = new ArrayList<>(Arrays.asList("during", "storm", "rain", "fell", "season", "cloudy", "safe"));
        ArrayList<Integer> lengths = new ArrayList<>();
        for(String word: words){
            lengths.add(word.length());
        }
        System.out.println(lengths);


    }

        */
    }
}




