package oop.reverse;

public class ReverserSlow implements Reverser{
    @Override
    public String reverse(String s) {
        char[] chars = new char[s.length()];
        for(int i = 0; i < s.length() ; i++){
            chars[s.length() - i - 1] = s.charAt(i);
        }
        return String.valueOf(chars);
    }
}
