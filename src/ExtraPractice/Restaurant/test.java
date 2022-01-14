package ExtraPractice.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        //names.removeAll(Arrays.asList("Ahmed"));
        names.removeIf( p -> p=="Ahmed");
        System.out.println(names);

    }
}
