package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {
        // create Dog objects
        Dog dog1 = new Dog();

        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";



        Dog dog2 = new Dog();
        dog2.name = "Ace";
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "Black & White";

        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "German Shapard", 2, 'M',"Large","Black");

        // we have to create a toString method to be able to print objects
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();
        dog2.bark();
        System.out.println("===========================================");

        Dog dog4 = new Dog();
        dog4.setInfo("Bullet","Labrador", 3, 'M', "Extra Large","Yellow");

        Dog dog5 = new Dog();
        dog5.setInfo("Sully", "Pit-Bull",6,'M',"Large","Black");

        Dog[] dogs = {dog1, dog2, dog3,dog4, dog5 };

        ArrayList<Dog> DogList = new ArrayList<>(Arrays.asList(dogs));
        DogList.removeIf(p-> p.gender =='M');
        ArrayList<Dog> femaleDogs = new ArrayList<>(DogList);
        System.out.println(femaleDogs);
        System.out.println( femaleDogs.size());
        System.out.println("============================================================");

        ArrayList<Dog> maleDogs = new ArrayList<>(Arrays.asList(dogs));
        maleDogs.removeIf(p-> p.gender=='F');
        System.out.println(maleDogs);

        System.out.println( maleDogs.size());



    }

}
