package ExtraPractice;

public class FirstDuplicatedCh {
    public static void main(String[] args) {
        String str = "Merry Christmas!";
        String result = ""; // p=2

        for (int i = 0; i < str.length(); i++) { // to find all the ch of str
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) { // to count the ch of str
                char each = str.charAt(j);
                if (ch == each) {
                    count++;
                }

            }
            if (result.contains("" + ch)) { // if(!result.contains(""ch)) will do the same
                continue;
            }
            result += ch;
            result += count;
        }
        System.out.println(result);
    }

}



/*
Tasks:
    1. Write a program that can return the first duplicated character from a string
    2. Write a program that cna return the index number of the first duplicated character from a string
    3. Write a program that can display all the characters that appeared twice in the string.
    4. Write a program that can return the index number of the first unique character.
 */