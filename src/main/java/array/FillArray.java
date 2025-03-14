package array;

import  java.util.Arrays;
import java.util.random.RandomGenerator;

public class FillArray {

    static RandomGenerator random =   RandomGenerator.getDefault();



    /**
     *
     * @param size -> double  dimensione array
     * @param value -> double da insierire nell array
     * @param addNoise -> boolean disturbo attivo o meno
     *
     *
     * */
    public static double[] fillArray(int size, double value, boolean addNoise){

        double[] arr = new  double[size];
        Arrays.fill(arr,value);
        double tail = value + value * 0.05;
        double head = value - value * 0.05;
        if(addNoise){
            System.out.println("sono nel if");
            for(int i = 0; i < size; i++){
                arr[i] = random.nextDouble(head,tail);
            }
        }

        return arr;

    }




    public static void main(String[] args) {
        System.out.println(Arrays.toString(fillArray(5, 1, true)));
    }


}
