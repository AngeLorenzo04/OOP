package array;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class FillArray {

    public static double[] fillArray(int size, double value, boolean addNoise){

        double[] dest = new double[size];
        java.util.Arrays.fill(dest,value);

        if(addNoise){
            RandomGenerator rnd = RandomGenerator.getDefault();

            for(int i = 0; i < dest.length; i++){
                if(value > 0){
                    dest[i] += rnd.nextDouble(-value,value)*0.05;
                }else dest[i] += rnd.nextDouble(value,-value)*0.05;

            }

        }

        return  dest;
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(fillArray(5, 5, false)) + "\n");
        System.out.println(Arrays.toString(fillArray(5, 5, true)) + "\n");
        System.out.println(Arrays.toString(fillArray(5, -1, false)) + "\n");
        System.out.println(Arrays.toString(fillArray(5, -1, true)) + "\n");
    }

}
