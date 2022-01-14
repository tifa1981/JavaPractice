package day34_GarbageCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {

    static {
        System.out.println("static Block");  // it will get executed automatically once a class is loaded, it's the first block that gets run
    }

    public Constructor_vs_StaticBlock(){
        System.out.println("Constructor");  //  can not be executed automatically, needs to create an object first
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }

}
