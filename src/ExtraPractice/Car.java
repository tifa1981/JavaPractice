package ExtraPractice;

public class Car {

    // declare instances so that we can have multiple objects

    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;

    public void setInfo(String carBrand, String carModel, String carColor, int carYear, double carPrice) {

        brand = carBrand;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;

    }

    public String toString() {
        return "CustomClass_Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }

    public void drive() {
        System.out.println("He is driving a " + brand + " " + model);
    }

    public void start() {
        System.out.println(brand + " " + model + " has started");
    }

    public void stop() {
        System.out.println(brand + " " + model + " has stopped");
    }
}



/*
Attributes:
brand, model, color, year, price

actions:
drive(), start(), stop(), toString, setInfo()

 */