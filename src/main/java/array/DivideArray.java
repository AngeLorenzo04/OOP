package array;

import java.util.Arrays;

public class DivideArray {


    public static double[] divideArray(double[] v, double factor){

        if(factor == 0){
            return null;
        }

        for(int i = 0; i < v.length; i ++){
            v[i] = v[i]/factor;
        }

        return  v;
    }


    public static void main(String[] args) {


        double[] v = new double[4];
        Arrays.fill(v,4);
        System.out.println(Arrays.toString(divideArray(v,2)));



    }


}
