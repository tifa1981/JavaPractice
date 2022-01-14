package ExtraPractice;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int a = 30;
        int b = 7;

        int count = 0;

        while(a>=b){
            a=a-b; // 30-7=23; 23-7=16; 16-7=9; 9-7=2
            count++;
        }
        System.out.println(count +  " with remainder of "+ a);
    }
}
/*
Write a program that can divide two numbers without using / (division) and * (multiplication) operators
 */