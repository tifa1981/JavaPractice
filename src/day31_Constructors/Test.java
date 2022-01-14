package day31_Constructors;

public class Test {
    public Test(){
        System.out.println("A ");

    }

    public Test(double c){
        this();
        System.out.println("C");
    }

    public Test(int a){
        this(2.5);
        System.out.println("B");
    }

    public static void main(String[] args) {
        Test obj = new Test(2.5);
    }
}
/*
public Test(int a){
        this(2.5);
        System.out.println("B");
    }
 */