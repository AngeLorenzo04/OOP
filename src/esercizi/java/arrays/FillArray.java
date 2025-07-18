package arrays;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class FillArray {
    public static double[] fillArray(int size, double value, boolean addNoise){

        RandomGenerator rg = RandomGenerator.getDefault();
        double[] ret = new double[size];
        Arrays.fill(ret,value);
        if(addNoise){
            for(int i = 0; i < size ; i++){
                double noise = rg.nextDouble(-value,value) * 0.05;
                ret[i] += noise;
            }
        }

        return ret;
    }
}
