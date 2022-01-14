package day19_LoopPractice;

public class UniqueCh {
    public static void main(String[] args) {
        String str = "aabcccdeef";
        String result = ""; //bdf



        for (int j = 0; j < str.length(); j++) { // find each ch of str
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) { // compares the character that outer loop picked, with each ch,
                                                     // if is true, count will increase by 1

                char each = str.charAt(i);
                if (ch == each) {
                    count++;

                }

            }

       /* if(count==1){ //if the frequency of the ch is 1, then the ch is unique
            result+=ch;
            */
            if(count!= 1){
                continue;
            }
             result+=ch;

        }
        System.out.println(result);
        }

    }

