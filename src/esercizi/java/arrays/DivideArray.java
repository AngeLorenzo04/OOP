package arrays;

public class DivideArray {
    public static double[] divideArray(double[] v, double factor){
        for(int i = 0;  i < v.length; i++){
            v[i] /= factor;
        }
        return v;
    }

}
