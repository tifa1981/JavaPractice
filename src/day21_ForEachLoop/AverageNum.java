package day21_ForEachLoop;

public class AverageNum {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50,60};
        double sum=0; // 10+20+30...

      /*  for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }

       */

        for (int number : numbers) {
            sum += number;

        }
        double averageNum=sum/ numbers.length;

        System.out.println("averageNum = " + averageNum);
    }
}
