package day20_Array;

public class AppearTwice {
    public static void main(String[] args) {

        char[] chars = {'A', 'A', 'A', 'B', 'C', 'C', 'D', 'D', 'D'};
        String result = "";
        for (int j = 0; j < chars.length; j++) {

            char ch = chars[j];
            int count = 0;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == ch) {
                    count++;
                }
            }

            if ( count==2) {

                    System.out.println(ch);

                    break;
            }


        }
    }
}