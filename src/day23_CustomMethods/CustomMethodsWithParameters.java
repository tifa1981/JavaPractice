package day23_CustomMethods;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {
        oddOrEven(10);
        ageOfPerson(1981);
        printNumbers(10,20);
    }


    //create a function that can check if a number is odd or even number
    public static void oddOrEven(int number){
        if(number%2==0){
            System.out.println(number + " is even number" );
        }else{
            System.out.println(number + " is odd number" );
        }
    }

    // create a function that can display the age of the person

    public  static void ageOfPerson(int birthYear){
        int age = 2021 - birthYear;
        System.out.println("Your age is: " +age);


    }

    //create a function that xan print all the number between x and y
    public static void printNumbers(int x, int y){

        for (int i = x; i <y ; i++) {
            System.out.println(i);
        }





    }
}
