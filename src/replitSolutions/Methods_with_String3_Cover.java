package replitSolutions;

public class Methods_with_String3_Cover {
    public static void main(String[] args) {
        System.out.println(coverString("java methods", "me"));  // java [me]thods
        System.out.println(coverString("Certified Wooden Spoon", "o"));

    }

    public static String coverString(String main, String coverMe){

        // "java methods", "me"

        String result = "";

        if(! main.contains(coverMe)){
            result = "[" + coverMe + "]";
        }else{
            result = main.replace(coverMe, "[" + coverMe + "]");
        }
        return result;
    }
}
