package array;

public class Fibonacci {

    public static long[] fibonacci(int n){

        long[]sequence;
        if(n == 0){
            sequence = new long[]{0};
            return  sequence;
        }
        if(n == 1){
            sequence = new long[]{1};
            return sequence;
        }

        sequence = new long[n];
        sequence[0] = 0;
        sequence[1] = 1;
        for(int i = 2 ; i < n; i++){
            sequence[i] = sequence[i-1] + sequence[i - 2];
        }
        return sequence;
    }


    public static void main(String[] args) {
        System.out.println("fibonacci 1: " + java.util.Arrays.toString(fibonacci(1)));
        System.out.println("fibonacci 2: " + java.util.Arrays.toString(fibonacci(2)));
        System.out.println("fibonacci 3: " + java.util.Arrays.toString(fibonacci(3)));
        System.out.println("fibonacci 4: " + java.util.Arrays.toString(fibonacci(4)));
        System.out.println("fibonacci 5: " + java.util.Arrays.toString(fibonacci(5)));
    }

}
