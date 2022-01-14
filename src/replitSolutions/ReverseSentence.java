package replitSolutions;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        String[] arr = sentence.split(" ");
        String result = "";

        for (int i = arr.length - 1; i >= 0; i--) {
           result += arr[i] +" ";

        }
        System.out.println(result);



    }
}
/*
Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.

Example:

sentence -> Java is fun

reversed > fun is Java
 */