package oop.reverse;

public class ReverserSlow {
    public String Reverser(String str){
        StringBuilder out = new StringBuilder();
        for(int i = str.length() - 1; i > 0 ; i--){
            out.append(str.charAt(i));
        }
        return out.toString();
    }
}
