package array;

public class CopyArray {
    public static double[] copyArray(double[] src){
        double[] dist  = new double[src.length];
        System.arraycopy(src, 0, dist,0, src.length);
        return dist;
    }

}
