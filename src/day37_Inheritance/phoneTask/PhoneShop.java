package day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Iphone12" , "Large", "White", 975.50);
        Samsung samsung = new Samsung("galaxy S19","6 inches","Black",900);
        Nokia nokia = new Nokia("Brick","4 inches","Grey",50);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(123456789);
        iphone.faceTime("yahoo@gmail.com");
        System.out.println("====================================");
        System.out.println(iphone.hasBattery);
    }
}
