package arrays;

import java.util.Arrays;

public class DeepCopy {

    public static int[][] deepCopy(int[][] original){

        int[][] copy = new int[original.length][];

        int j = 0;
        for(int[] arr : original){
            copy[j] = Arrays.copyOf(arr,arr.length);
            j++;
        }
        return copy;
    }

}
