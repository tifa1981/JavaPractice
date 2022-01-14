package replitSolutions;

import java.util.Scanner;

public class Methods_PrintUniqueNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        for(int i =0; i <nums.length;i++){

            boolean isUnique= true;
            for(int k = 0; k<nums.length;k++){
                if(i!=k && nums[i] == nums[k]){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                System.out.println(nums[i]);

            }

        }


    }

}


