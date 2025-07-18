package arrays;

import java.util.Arrays;

public class Splitter {

    public static int[] splitter(int input){

        String inputS = Integer.toString(input);

        int[] out = new int[inputS.length()];

        for(int i = 0; i < inputS.length(); i++){
            out[i] = Integer.parseInt(String.valueOf(inputS.charAt(i)));
        }

        System.out.println("output: " + Arrays.toString(out));

        return out;
    }

}
