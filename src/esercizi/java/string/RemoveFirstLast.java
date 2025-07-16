package string;

public class RemoveFirstLast {

    public static String removeFirstLast(String s){

        StringBuilder sb = new StringBuilder(s);

        if( s.length() > 1 && s.charAt(0) == s.charAt(s.length() - 1)){
            return sb.substring(1,s.length()-1);
        }

        return s;

    }

    public static void main(String[] args) {

        System.out.println("removeFirstLast(\"google\") → " + removeFirstLast("google"));
        System.out.println("removeFirstLast(\"aenema\") →  " + removeFirstLast("aenema"));
        System.out.println("removeFirstLast(\"FF\") →  " + removeFirstLast("FF"));
        System.out.println("removeFirstLast(\"F\") → " + removeFirstLast("F"));

    }

}
