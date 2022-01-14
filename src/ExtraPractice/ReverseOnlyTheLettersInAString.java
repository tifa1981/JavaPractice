package ExtraPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseOnlyTheLettersInAString {

        public static void main(String[] args) {
        /* "--!--qwe--r-_?-tyf..3.gd.--9-"
consider you have a string like the one above. You don't know how the string looks like.
Reverse only the letters in the String
for example q with d, w with g, e with f and so on
output should be [-, -, !, -, -, d, g, f, -, -, y, -, _, ?, -, t, r, e, ., ., 3, ., w, q, ., -, -, 9, -]
         */

            String s = "--!--qwe--r-_?-tyf..3.gd.--9-";
            char[] chars = s.toCharArray();

            ArrayList<Character> charsList = new ArrayList<Character>();
            for (int i = 0; i < chars.length; i++) {
                charsList.add(chars[i]);
            }

            System.out.println(charsList);

            int startPoint = charsList.size();

            for (int i = 0; i < charsList.size(); i++) {
                if(!Character.isLetter(charsList.get(i))) {
                    continue;
                }
                for (int j = startPoint - 1; j>=0; j--) {
                    if (j<i){
                        break;
                    }
                    if(Character.isLetter(charsList.get(j))){
//                   Character temp = charsList.get(i);
//                   charsList.set(i, charsList.get(j)) ;
//                   charsList.set(j, temp);
                        startPoint=j;
                        Collections.swap(charsList,i,j);
                        break;

                    }

                }

            }
            System.out.println(charsList);
        }
    }

