package array;

import java.util.Arrays;

public class DivideArrays {
    public static double[] divideArrays(double[] v1, double[] v2){
            if(v1.length  != v2.length){
                return null;
            }

            for(int i = 0; i < v1.length; i++){
                v1[i] = v1[i] / v2[i];
            }

            return v1;


    }


    public static void main(String[] args) {
        double [] v1 = new double[3];
        double [] v2 = new double[3];
        Arrays.fill(v1,4);
        Arrays.fill(v2,2);
        System.out.println(Arrays.toString(divideArrays(v1, v2)));
    }
}
