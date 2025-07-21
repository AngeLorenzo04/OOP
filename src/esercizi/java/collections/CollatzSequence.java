package collections;

import java.util.ArrayList;
import java.util.List;

public class CollatzSequence {

    public static List<Long> collatzSequence(long n){
        List<Long> out = new ArrayList<>();
        if(n < 1){
            return out;
        }
        out.add(n);
        if(n == 1){
            return out;
        }

        long tmp = out.getLast();
        while (tmp != 1){

            if(tmp %2 == 0){
                out.add(tmp/2);
            }else{
                out.add(tmp * 3 + 1);
            }
            tmp = out.getLast();

        }
        return out;

    }

}
