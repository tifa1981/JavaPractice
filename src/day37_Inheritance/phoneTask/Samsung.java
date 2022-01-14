package day37_Inheritance.phoneTask;

public class Samsung extends Phone{
    public Samsung(String model, String size, String color, double price){
        super("Samsung",model, size, color, price);
    }
}




/*
Create a sub class of Phone named Samsung:
                Variables:
                    brand, model, size, price, color

                Methods:

                    call(long phoneNumber)
                    text(long phoneNumber)
                    freeze()
                    toString()
 */