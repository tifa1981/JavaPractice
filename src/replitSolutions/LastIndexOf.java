package replitSolutions;

import java.util.Scanner;

public class LastIndexOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.next();

        char lastChar = word.charAt(word.length()-1);
        System.out.println(lastChar);
    }
}
