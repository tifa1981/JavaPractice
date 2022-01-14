package ExtraPractice;

public class OddOrEven {
    public static void main(String[] args) {

        int[] oddOrEven = {1,2,5,8,9,22,44,56,77};

        for (int each:oddOrEven) {
            if(each%2==0){
                System.out.println(each);
            }

        }

    }
}
/*
 Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */