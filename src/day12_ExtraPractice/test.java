package day12_ExtraPractice;

public class test {
    public static void main(String[] args) {
        int x = 10;
        int y = x++; // the value of y and x are both 10 here,but x will become 11 next line as below.

        System.out.println(y++ +"" + x++ +"" +y );
                        // 10        11       11(here y is 11 because of the previous "y++" on the same line)


    }
}
