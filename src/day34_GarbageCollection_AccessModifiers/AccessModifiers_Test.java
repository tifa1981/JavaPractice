package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers_Test {


    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
        System.out.println( AccessModifiers.defaultData);

        // System.out.println(AccessModifiers.privateData);
        // this is a private access modifier, can't be call outside the class
    }
}
