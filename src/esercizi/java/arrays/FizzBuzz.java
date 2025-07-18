package arrays;

import java.util.Arrays;

public class FizzBuzz {

    public static String[] fizzBuzz(int start, int end){

        if(start >= end || start < 0 ){
            return new String[]{};
        }

        int[] arr = new int[end - start];

        for(int i = start; i < end; i++){
            arr[i - start] = i;
        }

        String[] out = new String[arr.length];

        int i = 0;
        for(int e : arr){
            if(e%3 == 0 && e%5 == 0){
                out[i] = "FizzBuzz";
            }else if(e%3 == 0){
                out[i] = "Fizz";
            }else if(e%5 == 0){
                out[i] = "Buzz";
            }else{
                out[i] = Integer.toString(e);
            }
            i++;
        }

        System.out.println(Arrays.toString(out));
        return out;

    }

}
