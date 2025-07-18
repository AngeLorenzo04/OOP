package string;

public class Reverse {

    public static String reverseCharAt(String string){

        StringBuilder sb = new StringBuilder();
        for(int i = string.length() - 1 ; i >= 0; i--){

            sb.append(string.charAt(i));

        }

        return sb.toString();

    }
    public static String reverseStringBuilder(String string){
      return new StringBuilder(string).reverse().toString();
    }


    public static void main(String[] args) {

        System.out.println("reverse(\"String test\") -> " + reverseStringBuilder("String Test"));
        System.out.println("reverse(\"String test\") -> " + reverseCharAt("String Test"));

    }
}
