package replitSolutions;

import java.util.Scanner;

public class EqualsJavaPython {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine().toLowerCase();
        int count1 = 0;
        int count2 = 0;
        boolean javaEqualsToPython=false;

        for (int i = 0; i < sentence.length(); i++) {

            if (sentence.substring(i).startsWith("java")) {
                count1++;
            }
            if (sentence.substring(i).startsWith("python")) {
                count2++;
            }


        }
        if (count1 == count2) {
            javaEqualsToPython =true;



        }
        System.out.println(javaEqualsToPython);
    }
}
/*
Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number
of appearances of "python" anywhere in the string (case sensitive).

Example:

input: We study java not python
output: true

input: What's the difference between java, javascript and python?
output: false
 */