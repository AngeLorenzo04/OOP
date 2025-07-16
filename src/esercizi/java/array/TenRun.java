package array;

import java.util.Arrays;

public class TenRun {

    public static int[] tenRun(int[] v){
        int[] out = new int[v.length];
        int multiplo = 0;
        for( int i=0; i< v.length; i++){
            if(v[i] != 0 && v[i] % 10 == 0){
                multiplo = v[i];
            }
            if(multiplo != 0){
                out[i] = multiplo;
            }else out[i] = v[i];

        }
        return out;
    }


    public static void main(String[] args) {

        int[] arr1 = new int[]{2, 10, 3, 4, 20, 5};
        int[] arr2 = new int[]{10, 1, 20, 2};
        int[] arr3 = new int[]{10, 1, 9, 20};

        System.out.println(Arrays.toString(arr1) + " -> " + Arrays.toString(tenRun(arr1)));
        System.out.println(Arrays.toString(arr2) + " -> " + Arrays.toString(tenRun(arr2)));
        System.out.println(Arrays.toString(arr3) + " -> " + Arrays.toString(tenRun(arr3)));

    }

}
