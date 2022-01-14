package replitSolutions;

import java.util.Scanner;

public class Zombie1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int count = 0;
        for(int a = inhabitants; a >=0; a-=inhabitants/=2){
            if (inhabitants==0){
                break;
            }
            System.out.println("Day "+count+" ["+inhabitants+ "]");

            count++;

        }
        System.out.println("---- EXTINCT ----");

    }

}
