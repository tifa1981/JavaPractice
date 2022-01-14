package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers {

    // all three tpyes of access modifiers are avaible within the class

    public static int publicData = 100;

    static int defaultData = 300; // this is a default modifier, no keyword needed
    private static int privateData = 200;

    public static void main(String[] args) {
        System.out.println("publicData = " + publicData);
        System.out.println("defaultData = " + defaultData);
        System.out.println("privateData = " + privateData);
    }
}
