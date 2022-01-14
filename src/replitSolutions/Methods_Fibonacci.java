package replitSolutions;

public class Methods_Fibonacci {


    public static void main(String[] args) {
        fib(8);
    }



    public static void fib(int num) {
        // int num is the index of an array, so we have to set the array length as num+1

        int[] arr = new int[num + 1];  // 2---> [0,1,1]
        arr[1] = 1;       // elements in any int array is 0 by default, so we have to set the value of the element 1

        for (int i = 0; i <= arr.length - 3; i++) {   // in order to get 3 elements at a time, we have to set the length-3
                                                     // so we don't go outOfBound
            arr[i + 2] = arr[i] + arr[i + 1];
        }
        System.out.println(arr[arr.length-1]);


    }
}
