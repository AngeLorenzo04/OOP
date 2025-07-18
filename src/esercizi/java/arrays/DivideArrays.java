package arrays;

public class DivideArrays {

    public static double[] divideArrays(double[] v1, double[] v2){

        if(v1.length != v2.length){
            return new double[0];
        }

        double[] out = new double[v1.length];
        int i = 0;
        for(double e : v1){
            out[i] = e/v2[i];
            i++;
        }

        return out;

    }

}
