package replitSolutions;

import java.util.Arrays;
import java.util.Scanner;

public class SplitEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below
        String emaill[] = email.split("@");
        int count = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) != '@') {
                System.out.println("invalid email");
            }
            if (email.charAt(i) == '@') {
                count++;
            }
        }
        if (count >= 2) {
            System.out.println("invalid email");

        } else {

            System.out.println("Email id: " + emaill[0]);
            System.out.println("Email domain: " + emaill[1]);

        }


    }


}





/*
Given a String variable email, write code using split method to print email id and domain in separate lines.

Example:

email -> info@cybertekschool.com

Output:
Email id: info
Email domain: cybertekschool.com

If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com
Output:
invalid email

email -> my@fancy@email.com
Output:
invalid email
 */