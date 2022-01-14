package ExtraPractice;

public class CommonElementsInAnArray {

    public static void main(String[] args) {
        int arr1[] = {1, 2, 5, 7, 89, 3};
        int arr2[] = {1, 45, 87, 34, 3};
/*
        for(int i=0;i<arr1.length;i++) {
            for(int j=0;j<arr2.length;j++) {
                if(arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] +" ");
                }
            }
        }


 */
        for (int each1 : arr1) {

            for (int each2 : arr2) {
                if (each2 == each1){
                    System.out.println(each2);
                }

            }
                   }
    }
}
/*
 Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


          MUST use for each loops
 */