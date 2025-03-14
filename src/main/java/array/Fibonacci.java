package array;

import java.util.Arrays;

public class Fibonacci {
    public static int element(int n) {
        if (n <= 1) return n;
        return element(n - 1) + element(n - 2);
    }

    public static long[] fibonacci(int n){


        long[] arr = new long[n];
        for(int i = 0; i < n ; i++){
            arr[i] = element(i);
        }

        return arr;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibonacci(0)));
    }




}
