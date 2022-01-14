package ExtraPractice;

public class RemoveExtraSpace {
    public static void main(String[] args) {

        String str = "Hi!   How   are    you?";
                   // 0123 4
        for (int i = 0; i < str.length() ; i++) {

            if((str.charAt(i)+"").equals(" ")){

                while (str.charAt(i)==str.charAt(i+1)){ // if both i and i+1 are space, use line 12 to eliminate one extra space

                    str = str.substring(0, i) + str.substring(i + 1);

                    // line 12 is dividing str into two parts using substring method,  and then they are combined back to one
                    // string after eliminate the extra space
                }

            }
        }

        System.out.println(str);
    }

}

