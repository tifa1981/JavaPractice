package day32_Constructor;

public class ConstructorCalls {

    public ConstructorCalls(){
       // this(9); will give compile error
        System.out.println("Default Constructor");
    }
    public ConstructorCalls(int a){
        this(); // calling the default constructor
        System.out.println("Constructor with int argument");

    }
    public ConstructorCalls(String str){
        this(10); // calling the default constructor, and then execute the int argument
        System.out.println("Constructor with String argument");

    }

    public static void main(String[] args) {
        ConstructorCalls obj1 = new ConstructorCalls();
        System.out.println("=============================");

        ConstructorCalls obj2 = new ConstructorCalls(10);
        System.out.println("======================================================");

        ConstructorCalls obj3 = new ConstructorCalls("Java");
        System.out.println("====================================");



    }
}



/*
Constructor Call:
		1. Constructor can not be called by its name ( this() need to be used )
		1. Constructor can not be called by its name ( this() need to be used )
		2. Only a constructor can call another constructor
		3. Constructor call MUST be at the first step( call to this() must be the first statement in the {body statement) )
		4. One constructor can not call more than one constructor
		5. Constructor can not call or conatins itself
 */