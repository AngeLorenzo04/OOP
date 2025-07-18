package arrays;

public class BubbleSort {

    public static void bubbleSort(int[] v){

        boolean finish = false;

        while (!finish){
            finish = true;
            for(int i = 0; i < v.length - 1; i++ ){
                if(v[i] > v[i+1]){
                    int tmp = v[i];
                    v[i] = v[i+1];
                    v[i + 1] = tmp;
                    finish=false;
                }
            }
        }

    }
    public static int[] bubbleSortCopy(int[] v){

        int[] copy = new int[v.length];
        System.arraycopy(v,0,copy,0,v.length);
        BubbleSort.bubbleSort(copy);
        return copy;

    }

}
