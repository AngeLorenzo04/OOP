package arrays;

public class CopyArray {

    public static double[] copyArray(double[] v){
        double[] dest = new double[v.length];
        System.arraycopy(v,0,dest,0,v.length);
        return dest;
    }

}
