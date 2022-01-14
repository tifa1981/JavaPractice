package day20_Array;

public class MinNumOfArray {
    public static void main(String[] args) {
        int[] numbers={50,20,10,5,1,30};
        int min = numbers[0];


        for (int i = 0; i < numbers.length; i++) { // if there is an element in the array that's smaller, it will be assigned
                                                   // to the variable min

            if(numbers[i]<min){
                min=numbers[i];
            }

        }
        System.out.println(min);
    }

}
