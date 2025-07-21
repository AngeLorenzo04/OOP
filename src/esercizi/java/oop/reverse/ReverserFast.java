package oop.reverse;

public class ReverserFast implements Reverser{
    @Override
    public String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
