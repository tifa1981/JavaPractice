package day37_Inheritance.scrumTask;

public class ProductOwner extends Employee{
    public ProductOwner(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "PO", id, salary, companyName);
    }
}
