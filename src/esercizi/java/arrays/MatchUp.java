package arrays;


public class MatchUp {

    public static int matchUp(int[] v1, int[] v2){

        int count = 0;
        for(int i = 0; i < v1.length; i++){
            int diff = Math.abs(v1[i] - v2[i]);
            if(diff <= 2 && v1[i] != v2[i]){
                count++;
            }
        }
        return count;
    }

}
