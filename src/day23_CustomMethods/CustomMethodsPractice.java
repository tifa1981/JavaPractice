package day23_CustomMethods;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        helloWorld5Times();
        System.out.println("----------------------");
        helloCydeo5Times();
        System.out.println("-------");
        evenNumbers();
    }
    // creat a funtion that can print hello world 5 times
    public static void helloWorld5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

    }


    // creat a funtion that can print hello Cydeo 5 times
    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo!");

        }
    }

    // creat a funtion that can print all the even numbers from 1~10 ===> evenNumbers
    public static void evenNumbers(){
        for (int i = 1; i < 11; i++) {
            if(i%2==0){
                System.out.println(i);
            }

        }
    }

}
