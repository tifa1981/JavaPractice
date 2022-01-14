package day33_Statics;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Ahmet";

        Employee employee2= new Employee();
        employee2.name = "Aygun";

        Employee employee3 = new Employee();
        employee3.name = "Fady";   // if the instance name was set as static, the system will only
                                    // store the data that was last assigned to name which is "Fady" in this case

        System.out.println(employee1.name); // Fady
        System.out.println(employee2.name); // Fady
        System.out.println(employee3.name);  // Fady

    }
}
