package org.example;

import static array.CopyArray.copyArray;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        double[] arr = new double[3];
        for(double e: arr){
            e = Math.random();
        }

        double[] cp = copyArray(arr);

    }


}