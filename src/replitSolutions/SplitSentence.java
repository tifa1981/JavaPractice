package replitSolutions;

import java.util.Arrays;

public class SplitSentence {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        String[] splittedSentence = sentence.split(" ");

        for (String each : splittedSentence) {
            System.out.println(each);

        }


    }
}
/*
Given a String variable sentence, write code to type each word in separate lines.

Example:

sentence -> "Java is fun"

Print

Java
is
fun
 */