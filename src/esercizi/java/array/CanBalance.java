package array;

import javax.swing.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class CanBalance {

    public static boolean canBalance(int[] v){

        int sum1 = 0;
        int sum2 = 0;
        int size = v.length;
        if(v.length % 2 != 0){
            size++;
        }


        for(int i = 0; i < v.length; i++){

            if( i < size/2 ){
                sum1 += v[i];
            }else sum2 += v[i];

        }


        return sum1 == sum2;
    }


    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 1, 1, 2, 1};
        int[] arr2 = new int[]{2, 1, 1, 2, 1};
        int[] arr3 = new int[]{10,10};

        System.out.println("canBalance([1, 1, 1, 2, 1]) -> " + Boolean.toString(canBalance(arr1)));
        System.out.println("canBalance([2, 1, 1, 2, 1])  -> " + Boolean.toString(canBalance(arr2)));
        System.out.println("canBalance([10,10]) -> " + Boolean.toString(canBalance(arr3)));
    }

}
