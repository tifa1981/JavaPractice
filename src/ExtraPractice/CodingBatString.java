package ExtraPractice;

public class CodingBatString {
    public static void main(String[] args) {
        /*String str = "james";
        int n = 0;

        String stringTimes= str.repeat(3);
        str = stringTimes;

        System.out.println(str);

        // another way to solve it using loop

         */

      String result = "";
      String str = "Hello";
      int n =5;

        for (int i = 0; i < n ; i++) {
            result= result + str;

        }
        System.out.println(result);
    }

}
/*

Given a string and a non-negative int n, return a larger string that is n copies of the original string.


stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi
 */