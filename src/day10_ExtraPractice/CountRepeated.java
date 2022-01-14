package day10_ExtraPractice;

public class CountRepeated {
    public static void main(String[] args) {
        String str = "aaabbaacbba";

        int count=0;

        for (int i = 0; i < str.length(); i++) { // i = indexes of str

            if(!str.substring(0,i).contains(""+str.charAt(i))){ // this if statement is to find the new ch other than ch(0)
                char newChar = str.charAt(i);
                count=0;
                for (int j = 0; j < str.length(); j++) {
                    if(newChar == str.charAt(j)){  // this if statement is to count how many times the new ch appears
                        count++;
                    }
                }
                System.out.println("" + str.charAt(i) + count);
            }



        }



    }



}
