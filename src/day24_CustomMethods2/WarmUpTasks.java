package day24_CustomMethods2;

public class WarmUpTasks {
    public static void main(String[] args) {
        WarmUpTasks("Cydeo", "School");
        System.out.println("---------------------");

        domain("Cydeo.School@amazon.com");
        System.out.println("-----------------");

        String [] emails = {"josh@gmail.com", "m@yahoo.com", "Elminur@yahoo.com","Gulsen@hotmail.com"};

        //domain(emails[0]);

        for (String email: emails ) {
            domain(email);
        }
        System.out.println("-----------");
        nameOfMonth(3);
    }



    //Create a method that can display the initials of the person
    public static void WarmUpTasks(String firstName, String lastName){

       String initials = firstName.charAt(0) + "." + lastName.charAt(0);
       initials = initials.toUpperCase();
        System.out.println("initials = " + initials);


        

    }

    //Create a method that can display the domain of the email
    public static void domain(String email){
        String domain = email.substring(email.indexOf('@')+1, email.lastIndexOf('.'));
        System.out.println("domain = " + domain);
    }

    //Create a method that can display the name of the month based on the given number to the method

   public static void nameOfMonth(int number){
        String name = "";
        if(number>=1 && number<=12){
            name= (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"Mar":(number==4)?"April":(number==5)?"May"
                    :(number==6)?"June":(number==7)?"July":(number==8)?"Aug":(number==9)?"Sep":(number==10)?"Oct"
                    :(number==11)?"Nov":"Dec";

        }else{
            name = "Invalid";
        }
        String nameOfMonth=name;
       System.out.println(nameOfMonth);
   }

   //Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){


    }
}

/*
Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has
	6.  ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)



method: grouping code fragments ===> creating a function

			advantage: improves the re-usability of our codes


			                             MUST       MUSt
		Access-Modifier   specifier   return-type  name  (Parameter){

					code fargments

		}

		Acess modifier: public
				public: ALWAYS ACCESSIBLE

		Specifier: static
				static: method can be called through its class name


		ReturnType: void, any dataType
				void: does not return a value

		Parameter: any dataType (if the method needs additional info)

		Method Name: meaningful, descriptive
 */