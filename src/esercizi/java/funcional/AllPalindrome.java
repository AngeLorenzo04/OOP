package funcional;

import java.util.List;



public class AllPalindrome {

    public static boolean allPalindrome(List<String> strings){
        return strings.stream().allMatch(AllPalindrome::isPalindrome);
    }

    private static boolean isPalindrome(String s){
        return new StringBuilder(s).reverse().toString().equals(s);
    }

}
