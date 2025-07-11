package array;

import java.util.Arrays;

public class Splitter {

    public static int[] splitter(int input){


        String stringNum = Integer.toString(input);
        int digit = stringNum.length();
        int[] out = new int[digit];

        for(int i = 0; i< digit; i++){

            out[i] = Character.getNumericValue(stringNum.charAt(i));

        }

        return out;

    }

    public static void main(String[] args) {
        System.out.println("123: "+ Arrays.toString(splitter(123)));
        System.out.println("3213: "+ Arrays.toString(splitter(3213)));
        System.out.println("12: "+ Arrays.toString(splitter(12)));
        System.out.println("1212: "+ Arrays.toString(splitter(1212)));
    }

}
