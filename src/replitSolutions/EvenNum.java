package replitSolutions;

public class EvenNum {
    public static void main(String[] args) {
      /* for (int i = 80; i >=20 ; i=i-2) {
            String result = i +" ";
            System.out.print(result.substring(0, result.length() - 1));

       */
        /*for (int i = 80; i >=20 ; i=i-2) {
            System.out.print(i +" ");

        }*/

        String result = "";

        for (int i = 80; i >= 20; i--) {
            if (i % 2 == 0) {
                result += i + " ";
            }
        }
        System.out.println(result.substring(0, result.length() - 1));
    }
}




/*
Write a for loop that prints all even integers from 80 through and including 20. Seperate each number with a space
 */

