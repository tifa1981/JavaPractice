package day13_ExtraPractice;
import java.util.Scanner;
public class FirstAndLastCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input word: ");
        String word = scan.next();

        if(word.charAt(0)== word.charAt(word.length()-1)){
            System.out.println("Output: same ");
        }else{
            System.out.println("Output: Not the same");
        }
        scan.close();
    }
}

