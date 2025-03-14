package array;

public class BubbleSort {
    public static void bubbleSort(int[] v){
        int n = v.length;
        boolean swapped = true;

        while (swapped) {
            swapped = false;
            int i = 0;

            while (i < n - 1) {
                if (v[i] > v[i + 1]) {
                    // Scambia gli elementi
                    int temp = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = temp;
                    swapped = true;
                }
                i++;
            }
            n--; // Riduciamo la lunghezza effettiva perché l'ultimo elemento è già in posizione corretta
        }
    }

    public static int[] bubbleSortCopy(int[] v){
        int[] cp = v;
        bubbleSort(cp);
        return cp;
    }
}
