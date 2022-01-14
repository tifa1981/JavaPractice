package day31_Constructors.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {

        // 4 testers ojects
        Tester tester1 = new Tester("Layan", 1102, "SDET", 120000);
        Tester tester2 = new Tester("Tifa", 1103, "QA", 125000);
        Tester tester3 = new Tester("Layla", 1104, "SDET", 110000);
        Tester tester4 = new Tester("Guiania", 1105, "SDET", 100000);

        Tester[] testers = {tester2,tester3,tester4};



        // 5 developers objects
        Developer developer1 = new Developer("Olga" , 1106, "Java Developer",135000);
        Developer developer2 = new Developer("Ola" , 1107, "Java Developer",145000);
        Developer developer3 = new Developer("Alex" , 1108, "Java Developer",185000);
        Developer developer4 = new Developer("Tim" , 1109, "Java Developer",130000);
        Developer developer5 = new Developer("Waleed" , 1110, "Java Developer",200000);

        Developer[] developers = { developer2,developer3,developer4};


        //1 ScrumTeam Object
        ScrumTeam scrum = new ScrumTeam("Duraid", "Hussein", "neira",14 );
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDeveloper(developers);

        System.out.println(scrum);
        System.out.println("==========================================");

        for (Tester eachTester:scrum.testersList) {
            System.out.println(eachTester.name + " : " + eachTester.salary);

        }
        System.out.println("==================================================");

        for (Developer eachDeveloper: scrum.devopsList){
            System.out.println(eachDeveloper.name + " : " + eachDeveloper.salary);
        }
        System.out.println("=============================================");

        scrum.removeTester(1105);
        scrum.removeDeveloper(1109);
        System.out.println(scrum);










    }
}
