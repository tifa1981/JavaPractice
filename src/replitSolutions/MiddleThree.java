package replitSolutions;

import java.util.Scanner;

public class MiddleThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        // String Middle3 = word.length()/2-1, word.length()/2, word.length()/2+1;
        String middle3 = word.substring(word.length()/2-1, word.length()/2+2); // the last index of substring (-1) will not be included, thus need to +1 here
        if(word.length()%2 != 0 && word.length()>=5){
            System.out.println(middle3);
        }else{
            System.out.println("invalid");
        }
    }
}


/*
Given a String variable word print the middle three characters if the word is an odd number of characters and has more
 than 5 characters. If the word does not meet the requirements print invalid.

fifteen ==> fte
fifteen ==> fte
apple ==> ppl
apple ==> ppl
hey ==> invalid
hey ==> invalid
java ==> invalid
java ==> invalid
whatsup ==> ats
whatsup ==> ats
$ ==> invalid
 */