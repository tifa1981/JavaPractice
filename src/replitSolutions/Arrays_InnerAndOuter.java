package replitSolutions;

public class Arrays_InnerAndOuter {
    public static void main(String[] args) {

        int[] outer =  {1,3,4,5,6,8,12};
        int[] inner = {4,5,6};

        /* [1,3,4,5,6,8,12]    [4,5,6]

        [4] ==>  [1,3,4,5,6,8,12] --> count +1
        [5] ==>  [1,3,4,5,6,8,12] --> count +1
        [6] ==>  [1,3,4,5,6,8,12] --> count +1

       counts == inner.length ==> true
         */

        int counterFound =0;
        for (int innerItem : inner) {
            for (int outerItem : outer) {

            if(innerItem==outerItem){
                counterFound++;
                break;
            }
            }

        }
        System.out.println(counterFound == inner.length);




    }
}
/*
Given 2 arrays of ints sorted in increasing order, outer and inner, print out true if all the numbers in inner appear in outer.
Take advantage of the fact that both arrays are already in sorted order.
exp 1:
input(outer):1,2,4,6
input(inner):2,4
output: true

exp2:
input(outer):1,2,4,
input(inner):6,5
output: false

 */