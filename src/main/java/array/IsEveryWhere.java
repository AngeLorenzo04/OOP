package array;

import java.util.Arrays;

public class IsEveryWhere {

    public static boolean isEveryWhere(int[] v, int value){

        for(int i = 0; i < v.length - 1; i++){

            if(v[i] != value && v[i + 1] != value){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2, 1, 3};
        int[] a2 = new int[]{1, 2, 1, 3};
        int[] a3 = new int[]{1, 2, 1, 3, 4};

        System.out.println(Arrays.toString(a1) + "->" + Boolean.toString(isEveryWhere(a1,1)));
        System.out.println(Arrays.toString(a2) + "->" + Boolean.toString(isEveryWhere(a2,2)));
        System.out.println(Arrays.toString(a3) + "->" + Boolean.toString(isEveryWhere(a3,1)));
    }
}
