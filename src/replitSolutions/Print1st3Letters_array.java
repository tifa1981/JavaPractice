package replitSolutions;

import java.util.Scanner;

public class Print1st3Letters_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
        }
       /* String first3Chars = "";

        for (int i = 0; i < arr.length; i++) {
            first3Chars = "" + arr[i].charAt(0) + arr[i].charAt(1) + arr[i].charAt(2);
            System.out.println(first3Chars);
        }


        */
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i].substring(0,3));

        }

    }

    }
