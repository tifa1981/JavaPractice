package day10_ExtraPractice;

import java.util.Scanner;

public class ChooseLanguage_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input a number ");
        int number = scan.nextInt();
        System.out.print("");

        if(number==1){
            System.out.println("Hello, thank for your call");
        }
        if(number==2) {
            System.out.println("Hola, gracias para llamar");
        }
        if(number==3){
            System.out.println("Merhaba, aradiginiz icin tesekkurler");
        }
        if(number==4){
            System.out.println("Privet, spasibo za vash zvonok");
        }
        if(number==5) {
            System.out.println("Merci ,pour votre appel");
        }
    }
}
