package arrays;

import java.util.Arrays;

public class MoveZerosEnd {

    public static int[] moveZerosEnd(int[] v){

        int[] out = new int[v.length];
        Arrays.fill(out,0);

        int i = 0;
        for(int e : v){
            if(e != 0){
                out[i] = e;
                i++;
            }
        }

        return out;

    }

}
