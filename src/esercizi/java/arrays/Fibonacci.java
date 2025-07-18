package arrays;

public class Fibonacci {

    public static long[] fibonacci(int n){

        long[] out = new long[n];
        if(n==1){
            out = new long[]{0};
        }else if (n == 2){
            out = new long[]{0,1};
        }else{
            out[0] = 0;
            out[1] = 1;
            for(int i = 2; i < n ; i++){
                out[i] = out[i-1] + out[i-2];
            }
        }

        return out;

    }
}
