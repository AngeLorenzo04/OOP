package collections;

import java.util.ArrayList;
import java.util.List;

public class CollatzSequence {

    public static List<Long> collatzSequence(long n){

        if(n < 1){
            return new ArrayList<>();
        }
        List<Long> out = new ArrayList<>();

        out.add(n);

        while (n != 1){
            if(n%2 == 0){
                n =  n / 2;
            }else n = n * 3 + 1;

            out.add(n);
        }

        return out;
    }

    public static void main(String[] args) {
        List<Long> list  = collatzSequence(2);
        for(Long e : list){
            System.out.println(Long.toString(e));
        }
    }

}
