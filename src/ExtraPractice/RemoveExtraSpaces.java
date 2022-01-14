package ExtraPractice;

public class RemoveExtraSpaces {
    public static void main(String[] args) {
        String str = "Hello    How    are  you   ?";

        while(str.contains("  ")){
            str = str.replace("  ", " ");

        }
        System.out.println(str);
    }
}
