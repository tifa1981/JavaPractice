package day21_ForEachLoop;

public class MaxNumber {
    public static void main(String[] args) {
        int [] numbers = {10, 5, 4, 20, 1, 0};
        int max=numbers[0]; // assume the first number is the max, then compare it with the rest of the numbers.
        // if the next number is greater than the 1st number, we will + to the result, etc...

      /*  for (int i = 0; i < numbers.length; i++) {// use numbers.forr shortcut to create the -- for loop

            if(numbers[i]> max){ // if there is an element in the array that's greater than the current max number(index 0)
                max=numbers[i];  // assigning greater number to variable max
            }
        }
        System.out.println(max);

       */
        for(int number:numbers){
            if(number > max){
                max=number;
            }

        }
        System.out.println(max);



    }
}
