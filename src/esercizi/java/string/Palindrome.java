package string;

public class Palindrome {

    public static boolean isPalindrome(String s){

        StringBuilder ds = new StringBuilder(s);
        ds.reverse();
        return s.equalsIgnoreCase(ds.toString());


    }


    public static void main(String[] args) {

        System.out.println("palindrome(\"whistleblower\") → " + isPalindrome("whistleblower"));
        System.out.println("palindrome(\"radar\")  " + isPalindrome("radar"));
        System.out.println("palindrome(\"r\") → " + isPalindrome("r"));
        System.out.println("palindrome(\"RaceCar\") → " + isPalindrome("RaceCar"));

    }

}
