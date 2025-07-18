package arrays;

public class CanBalance {


    public static boolean canBalance(int[] v){


        boolean valid = false;
        int total = 0;
        for (int j : v) {
            total += j;
        }

        int partial = 0;
        for (int j : v) {

            if (partial == total) {
                return true;
            }

            partial += j;
            total -= j;

        }

        return false;
    }

}
