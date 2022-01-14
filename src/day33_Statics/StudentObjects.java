package day33_Statics;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Ahment");

        Student student2 = new Student("Aygun", 'F');

        Student student3 = new Student("Nigara", 11);

        Student student4 = new Student("Mert", 12, 'A');

        Student student5 = new Student("Cihad", 'M',28);

        Student student7 = new Student("Aygun", 'F');



        System.out.println(student2.equals(student7));  // need to override the equals() method
                                                       // to be able to compare two objects in custom class
    }
}
