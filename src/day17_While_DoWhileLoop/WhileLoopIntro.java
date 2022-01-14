package day17_While_DoWhileLoop;

public class WhileLoopIntro {
    public static void main(String[] args) {
        if(true){
            System.out.println("Wooden Spoon");  // 1 time
        }
        while(true){
            System.out.println("Wooden Spoon"); // infinite loop, the print never stops.... this loop
        }                                       // only gets terminated when the condition becomes false.
    }
}
