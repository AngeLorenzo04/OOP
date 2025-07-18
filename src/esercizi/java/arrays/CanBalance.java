package arrays;

public class CanBalance {


    public static boolean canBalance(int[] v){


        boolean valid = false;
        int total = 0;
        for( int i = 0; i < v.length; i++){
            total += v[i];
        }

        int partial = 0;
        for(int i = 0; i < v.length; i++){

            if(partial == total){
                return true;
            }

            partial += v[i];
            total -= v[i];

        }

        return false;
    }

}
