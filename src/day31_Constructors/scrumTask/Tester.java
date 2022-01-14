package day31_Constructors.scrumTask;

public class Tester {

    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println(name + " is performing smoke testing daily.");
    }
    public void creatingTicket(){
        System.out.println(name + " has created his/her first ticket.");

    }
    public void dailyStandUp(){
        System.out.println(name + " is attending daily stand-up meetings.");

    }
}


/*
create a class called Tester
	        Attributes:
	            name, employeeID, JobTitle, Salary

	        Add A constructor that can set all the fileds

	        Actions:
	           smokeTesting(),  creatingTicket(), dailyStandUp() toString()

 */