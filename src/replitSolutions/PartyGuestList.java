package replitSolutions;

import java.util.Scanner;

public class PartyGuestList {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter guest name:");
        String name= scan.nextLine();
        String answerYesNo = "";
        boolean check = true;

        while(check){

           System.out.println("Do you want to enter new guest name:");
            answerYesNo = scan.next().toLowerCase();
            if(answerYesNo.equals("no")){
                check = false;
            }else if(answerYesNo.equals("yes")) {
                System.out.println("Please enter guest name:");
                scan.nextLine();
                name += ", " + scan.nextLine();


            }

        }

        System.out.println("Guest's list: "+ name);

    }
}
/*
Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)

Ask for the first guest name.

Then ask does user want to enter one more guests.

If yes - take the next guest input

If not - finish the program and print list of the guests.

Example:

Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no
Guest's list: Nick, Linda
 */
/*
int i = 0;
do {
  System.out.println(i);
  i++;
}
while (i < 5);
 */