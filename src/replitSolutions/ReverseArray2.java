package replitSolutions;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 44, 1, 100, 55};

       /*
       int temp = nums[0]; <== assigning number at index 0 to temp
        nums[0]=nums[6];
        nums[6] = temp;

        */

        for (int i = 0; i < nums.length/2 ; i++) {
            int tmp= nums[i];
            nums[i]=nums[nums.length-1-i];
            nums[nums.length-1-i]=tmp;

        }
        System.out.println(Arrays.toString(nums));





    }

}
