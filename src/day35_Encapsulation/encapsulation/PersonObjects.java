package day35_Encapsulation.encapsulation;

public class PersonObjects {
    public static void main(String[] args) {

        Person p1 = new Person();
         //  p1.name = "Daniel";
        //  p2.age = 28;   // these instances are private, need to use setter to set the data

        p1.setName("Daniel");
        p1.setAge(28);
    }
}
