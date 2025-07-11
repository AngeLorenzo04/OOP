package array;

public class MetchUp {

    public static int matchUp(int[] v1, int[] v2){
        int count =0;
        for(int i = 0; i < v1.length; i++){
            if(v1[i] != v2[i] && Math.abs(v1[i] - v2[i]) <= 2){
                count++;
            }

        }

        return count;

    }


    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = new int[]{2,3,10};
        int[] arr3 = new int[]{2,3,5};
        int[] arr4 = new int[]{2,3,3};
        System.out.println("matchUp([1, 2, 3], [2, 3, 10]) -> " + Integer.toString(matchUp(arr1,arr2)));
        System.out.println("matchUp([1, 2, 3], [2, 3, 5]) ->  " + Integer.toString(matchUp(arr1,arr3)));
        System.out.println("matchUp([1, 2, 3], [2, 3, 3]) ->" + Integer.toString(matchUp(arr1,arr4)));


    }

}
