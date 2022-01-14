package PracticeFromB22;

public class RemoveMiddleCharFromZipZap {
    public static void main(String[] args) {
    String str1 = "zipZap";

    /*str= str.replaceAll("z.p", "zp");
        System.out.println(str);

     */

        String result= "" + str1.charAt(0);

      for (int i = 1; i < str1.length(); i++) {


        if(str1.toLowerCase().charAt(i-1) =='z' && str1.toLowerCase().charAt(i+1) =='p') {

           continue;
        }
        result += str1.charAt(i);

        }
        System.out.println(result);


    }
}

/*
Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
 Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".


zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"
 */