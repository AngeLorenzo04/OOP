package arrays;

import java.util.Arrays;

public class TenRun {

    public static int[] tenRun(int[] v){

        int multiplo = -1;

        int[] out = new int[v.length];
        int i = 0;
        for(int e : v){
            if(e%10 == 0){
                multiplo = e;
            }
            if(multiplo != -1){
                out[i] = multiplo;
            }else out[i] = e;
            i++;
        }

        System.out.println(Arrays.toString(out));
        return out;

    }

}
