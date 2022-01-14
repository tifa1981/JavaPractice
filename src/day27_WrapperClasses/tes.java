package day27_WrapperClasses;

public class tes {
    public static void main(String[] args) {
        String word = "java is fun java is great";
        int count=0;
        for (int i = 0; i <word.length() ; i++) {
            if(word.substring(i).startsWith("java")){
                count++;

            }

        }

        System.out.println(count);
        }

}
