package array;

public class DivideArray {

    public static double[] divideArray(double[] v, double factor){
            double[] out = new double[v.length];
            for(int i = 0; i < v.length; i++){
                    out[i] = v[i] / factor;
            }
            return  out;
    }


    public static void main(String[] args) {
        double[] src = new double[]{(double)4.0F,(double)8.0F,(double)10.0F,(double)20.0F};
        System.out.println("src:          "+ java.util.Arrays.toString(src));
        System.out.println("divided by 2: "+ java.util.Arrays.toString(divideArray(src,2.0F)));
    }

}
