package day23_CustomMethods;

public class CustomMethodsIntro {
    public static void main(String[] args) {
        System.out.println("Test Started");
        greeting();  // you have to call this method, it will print the value of the method. and then it will exit the
                     // "greeting", the main method will continue executing what is after "greeting" method.
        System.out.println("Test Completed");
    }
        // void means it doesn't return anything, what it does is to perform the function

        public static void greeting () {
            // method can be created anywhere but not inside another method

            System.out.println("Hello Cydeo!");
            System.out.println("How are you today?");
        }
    }


