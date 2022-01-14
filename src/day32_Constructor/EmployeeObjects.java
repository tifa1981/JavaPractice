package day32_Constructor;

public class EmployeeObjects {
    public static void main(String[] args) {


        Employee employee1 = new Employee("Aaron");

        Employee employee2 = new Employee("Lucy", 'F');

        Employee employee3 = new Employee("Alex", 'M', "SDET");

        System.out.println(employee1);


    }

}
