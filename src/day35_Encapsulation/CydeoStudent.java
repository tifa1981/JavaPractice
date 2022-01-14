package day35_Encapsulation;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public int batchNumber;
    public int groupNumber;
    public String fieldOfStudy;

    public static String schoolName;
    public static String programmingLanguage;
    public static String secretCode;

    public CydeoStudent(String name, int age, char gender, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        schoolName= "Cydeo";
        programmingLanguage="Java";
        secretCode="Wooden Spoon" ;
    }

    public static void  printSchoolName(){
        System.out.println("school is "+ schoolName);
    }
    public static void  printSecretCode(){
        System.out.println("secretCode is "+ secretCode);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
   /* name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

        methods:
        printSchoolName();
        printSecretCode();
        attendClass():
        study()
        toString()

    */