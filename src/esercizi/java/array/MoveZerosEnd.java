package array;

import java.util.Arrays;

public class MoveZerosEnd {

    public static int[] moveZerosEnd(int[] v) {

        int[] out = new int[v.length];
        int j =0;

        for(int k : v){
            if(k != 0){
                out[j++] = k;
            }
        }
        return out;
    }


    public static void main(String[] args) {

        int[] Arr1 = new int[]{1,0,3,0};
        int[] Arr2 = new int[]{0,0,1,0};
        int[] Arr3 = new int[]{0,1,2,0};
        System.out.println("Arr1 :          " + Arrays.toString(Arr1));
        System.out.println("Arr2 :          " + Arrays.toString(Arr2));
        System.out.println("Arr3 :          " + Arrays.toString(Arr3));

        System.out.println("Arr1 ZeroMoved: " + Arrays.toString(moveZerosEnd(Arr1)));
        System.out.println("Arr2 ZeroMoved: " + Arrays.toString(moveZerosEnd(Arr2)));
        System.out.println("Arr3 ZeroMoved: " + Arrays.toString(moveZerosEnd(Arr3)));


    }

}
