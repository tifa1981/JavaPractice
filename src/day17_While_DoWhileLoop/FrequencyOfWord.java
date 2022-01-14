package day17_While_DoWhileLoop;

public class FrequencyOfWord {
    public static void main(String[] args) {
       // count how many times java appears in this string
        //String str = "JavaJava";
        String str = "Cat Cat Dog Dog";
        int frequency = 0;
        for (int i = 0; i < str.length()-2 ; i++) { // i<= str.length()-4
            String eachSubstring = str.substring(i,i+3);
            System.out.println("eachSubstring = " + eachSubstring);

            if(eachSubstring.equals("Cat")){
                // eachSubstring.equalsIgnoreCase("Cat")
                frequency++;
            }
        }


        System.out.println("frequency = " + frequency);
    }
}
