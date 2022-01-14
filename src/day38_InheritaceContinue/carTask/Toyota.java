package day38_InheritaceContinue.carTask;

public class Toyota extends Car {

    public Toyota( String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void reliable(){
        System.out.println(brand+" "+model+" is reliable");
    }
    // if there is no final/private, or it's not static method, we can override the method
    // the access modifier must be the same or has more visible( from default ==> protected==> public)
    public void start(){
        System.out.println("Twist the key to ignition to start " + model);
    }
}

/*
1. Toyota:
					extra methods:
							reliable()
 */

