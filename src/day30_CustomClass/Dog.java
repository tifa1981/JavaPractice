package day30_CustomClass;

public class Dog {

    // declare instance variables
    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    // declare instance methods

public void setInfo(String dogName,String dogBreed,int dogAge, char dogGender, String dogSize, String dogColor){
    name = dogName;
    breed = dogBreed;
    age = dogAge;
    gender = dogGender;
    size = dogSize;
    color = dogColor;

}
// if you create methods with "static" there will be only one copy of memory created for  all the objects within the class
    public void eat(){
        System.out.println(name +" is eating");
    }
    public void bark(){
        System.out.println(name + " is barking");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Attributes: create attributes as instances , to be able to store each object separately
1. name
2. age
3. gender
4. breed
5. size
6.color

Actions: use instance methods to specify actions
1. eat()
2. play()
3.  bark()




 */