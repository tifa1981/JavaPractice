package ExtraPractice;

public class IsPalindrome<arr> {
    public static void main(String[] args) {


        String[] arr = {"anna", "level", "Java"};
        int count = 0;
        for (String each : arr) {
            String reverse = "";


            for (int i = each.length() - 1; i >= 0; i--) {
                char ch = each.charAt(i);
                reverse += ch;
                if (reverse.equals(each)) {
                    count++;
                }

            }
        }
        System.out.println(count);
    }
}






/*
    4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */

