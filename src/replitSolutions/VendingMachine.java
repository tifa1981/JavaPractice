package replitSolutions;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter cents:");
        int cents = input.nextInt();

        int quarters = cents / 25;
        int dimes = cents % 25 / 10;
        int nickles = cents % 25 % 10 / 5;
        int pennies = cents % 25 % 10 % 5 / 1;

        if(cents > 0 && cents <=100){
            System.out.println("Your change is " + quarters + " quarters, "  + dimes + " dimes, "
                    + nickles + " nickels," + " and " + pennies + " pennies");
        }else
            System.out.println("Invalid cents amount");

        input.close();






    }
}

/*
Write a program that will determine the change given from the vending machine. The program will accept the cents amount and output the change in quarters, dimes, nickels, and pennies.

The given cents value should be more than 0 and less than 100. If the given cents is not in the range print "Invalid cents amount" and there should be no other output after
In valid cases print the change in this format: Your change is x quarters, x dimes, x nickels, and x pennies

Enter cents:
95
Your change is 3 quarters, 2 dimes, 0 nickels, and 0 pennies
 */