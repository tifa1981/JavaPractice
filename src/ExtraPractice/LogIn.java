package ExtraPractice;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your username: ");
        String username = scan.next();
        System.out.println("Please enter your password: ");
        String password = scan.next();

        if (username.equals("Cydeo") && password.equals("WoodenSpoon")) {
            System.out.println("Logged in");
        } else {

            for (int i = 0; i < 2; i++) {
                System.err.println("Incorrect username or password");
                System.out.println("Please enter your username:");
                username = scan.next();
                System.out.println("Please enter your password: ");
                password = scan.next();
                if (username.equals("Cydeo") && password.equals("WoodenSpoon")) {
                    System.out.println("Logged in");
                    break;
                }

            }
            if (!(username.equals("Cydeo") && password.equals("WoodenSpoon"))) {
                System.err.println("Your account is locked, please contact the support team");

            }
        }
        scan.close();
    }

}



/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter
                 correct credentials and if all three attempts are failed, then print "Your account is locked."
 */