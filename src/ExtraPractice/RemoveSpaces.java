package ExtraPractice;

import java.util.Arrays;

public class RemoveSpaces {
    public static void main(String[] args) {


        String str = "   Hello world     I   love   Java    ";
        removeSpaces(str);

    }
    public static void removeSpaces(String str){
        String result = "";
        String[] strArr = str.split(" ");

        for (String each: strArr) {
            if(!each.isEmpty()){
                result+=each+" ";
            }

        }
        System.out.println(result.trim());
    }

}
