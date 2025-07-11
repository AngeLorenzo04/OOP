package array;

import java.util.Arrays;

public class CopyArray {

    public static double[] copyArray(double[] v){
        double[] s = new double[v.length];
        System.arraycopy(v,0,s,0,v.length);
        return s;
    }

    public static void main(String[] args) {

        double[] s;
        s = new double[]{1, 2, 3, 4};

        System.out.println("arr: "+ Arrays.toString(copyArray(s)));

    }

}

