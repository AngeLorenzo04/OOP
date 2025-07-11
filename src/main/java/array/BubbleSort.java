package array;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] v){

        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < v.length; i++){
                if(i < v.length - 1 && v[i] > v[i+1]){

                    int tmp = v[i];
                    v[i] = v[i+1];
                    v[i + 1] = tmp;
                    sorted = false;
                }
            }
        }

    }
    public static int[] bubbleSortCopy(int[] v){

        int[] out = new int[v.length];
        System.arraycopy(v,0,out,0,v.length);
        bubbleSort(out);
        return  out;
    }

    public static void main(String[] args) {

        int[] arr1 = new int[]{3,2,5,5};
        int[] arr2 = new int[]{3,2,4,1};


        System.out.println("Arr1     : " +  java.util.Arrays.toString(arr1));
        System.out.println("Arr2     : " +  java.util.Arrays.toString(arr2));

        bubbleSort(arr1);
        System.out.println("Arr1 void: " +  java.util.Arrays.toString(arr1));
        System.out.println("Arr2 Copy: " +  java.util.Arrays.toString(bubbleSortCopy(arr2)));

    }

}
