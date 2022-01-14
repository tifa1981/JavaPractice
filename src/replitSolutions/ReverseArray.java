package replitSolutions;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 44, 1, 100, 55};

       /*
       int temp = nums[0]; <== assigning number at index 0 to temp
        nums[0]=nums[6];
        nums[6] = temp;

        */


        int temp = nums[0];
        for (int i =0, j =nums.length-1 ;i<=nums.length/2;i++,j--){
            temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;


        }
        System.out.println(Arrays.toString(nums));



        }
    }



/*
Given an array nums with 7 integers already assigned, write code to reverse it.

Do not use any additional arrays or Strings.

Example:

nums -> [4, 3, 2, 44, 1, 100, 55]

nums -> [55, 100, 1, 44, 2, 3, 4]

PseudoCode:

Take values at index 0 and last index and swap them

Take values at index 0+1 and last index-1 and swap them

Keep repeating step 1 and 2 using a loop until you reach the middle of the array (nums.length /2)

How to swap values:

int temp = nums[0];
nums[0] = nums[4];
nums[4] = temp;
 */