package replitSolutions;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        String result = "";

        if(a > b){
            result = "$" + a + " is greater";
        }else{
            result = "$"+ b + " is greater";
        }
        System.out.println(result);

    }

}
