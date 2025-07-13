package oop.reverse;

public class ReverseFast {

    public String Reverse(String str){
        StringBuilder out = new StringBuilder(str);
        return out.reverse().toString();
    }

}
