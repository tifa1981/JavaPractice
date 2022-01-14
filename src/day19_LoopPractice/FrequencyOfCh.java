package day19_LoopPractice;

public class FrequencyOfCh {
    public static void main(String[] args) {
        String str = "aabcccd";
        String result = ""; // a2b1c3d1

        for (int j = 0; j < str.length(); j++) { // outer loop: to find all the ch of the str


            char ch= str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) { // inner loop: to find the frequency
                char each = str.charAt(i); // each ch of str
                if (ch == each) {
                    count++;
                }

            }
            if(!result.contains(""+ch)) { // if(result.contains(""+ch)){
                                         //continue; }
                result += ch;
                result += count;
            }
        }


        System.out.println(result);
    }
}