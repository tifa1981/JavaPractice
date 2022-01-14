package day38_InheritaceContinue.carTask;

public class BMW extends Car{

    public BMW(String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breaksDown(){
        System.out.println(brand + " "+ model +" is breaking down");
    }

    public void racing(){
        System.out.println(brand + " "+ model +" is a racing car");
    }

    @Override
    public void start() {
        System.out.println("Call mechanic to Jump start " + model);
    }
}

/*
2. BMW:
					extra methods:
						breaksDown()
						racing()
 */

