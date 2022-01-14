package day20_Array;

public class UniqueElementOfArray {

    public static void main(String[] args) {


        String[] words ={"Java", "Java", "C#", "Python", "basic","Python"};

        for (int j = 0; j < words.length; j++) { // use this loop to loop through all the elements of array

            String element = words[j];

            int count =0;
            for (int i = 0; i < words.length; i++) { // use this loop to count

                if(words[i].equals(element)){
                    count++;
        }

            }
           if(count==1){
               System.out.println(element);
           }

        }





    }
}
