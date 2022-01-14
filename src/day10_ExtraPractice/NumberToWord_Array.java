package day10_ExtraPractice;
import java.util.*;
public class NumberToWord_Array {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("input a number ");
        int number = scan.nextInt();
        System.out.print("Number to word = ");

        String word[]= {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        

       if(number>=0 && number<=9){
           System.out.println(word[number]);
        }else {
            System.out.println("invalid number");
        }


    }



}
