package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max","Husky", 'M',2,"Small","Black");

        dog.eat();
        dog.bark();
        dog.drink();
        dog.move();
        dog.sleep();

        Cat cat = new Cat();
        cat.setInfo("Fistik","outside cat",'M',3,"Small","orange");

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', 4, "Large", "Red");

    }
}
