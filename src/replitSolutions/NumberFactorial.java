package replitSolutions;

public class NumberFactorial {
    public static void main(String[] args) {


                int number = 16;
                int factorial = 16;

                for(int i = (number - 1); i > 1; i--) {
                    factorial = factorial * i;
                }
                System.out.println("Factorial of 5 is " + factorial);
            }
        }


