package array;

import java.util.Arrays;

public class FizzBuzz {

    public static String[] fizzBuzz(int start, int end){

        if(start > end){
            return new String[]{};
        }

        String[] out = new String[end - start];
        int j=0;
        for(int i = start; i < end; i++){

            if(i % 3 == 0 && i % 5 == 0){
                out[j] = "FizzBuzz";
            } else if (i % 3 == 0) {
                out[j] = "Fizz";
            }else if(i % 5 == 0){
                out[j] = "Buzz";
            }else out[j] = Integer.toString(i);
            j++;

        }

        return out;

    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(fizzBuzz(1, 6)));
        System.out.println(Arrays.toString(fizzBuzz(1, 8)));
        System.out.println(Arrays.toString(fizzBuzz(12, 17)));
        System.out.println(Arrays.toString(fizzBuzz(8, 1)));

    }

}
