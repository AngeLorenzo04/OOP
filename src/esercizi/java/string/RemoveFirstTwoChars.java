package string;

public class RemoveFirstTwoChars {

    public static String removeFirstTwoCharsCharAt(String string){

        StringBuilder sb = new StringBuilder();

        for(int i=2; i < string.length(); i++){

            sb.append(string.charAt(i));

        }

        return  sb.toString();

    }

    public static String removeFirstTwoCharsStringBuilder(String string){
       return new StringBuilder(string).delete(0,2).toString();
    }


    public static void main(String[] args) {

        System.out.println("deletefirst2(\"String test\") -> " + removeFirstTwoCharsCharAt("String Test"));
        System.out.println("deletefirst2(\"String test\") -> " + removeFirstTwoCharsStringBuilder("String Test"));

    }
}



