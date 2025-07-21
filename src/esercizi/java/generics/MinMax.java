package generics;

import java.util.Comparator;
import java.util.List;

public class MinMax {


    public static <T> T max(List<T> list, Comparator<? super T> cmp){

        T max = list.getFirst();
        for(T e : list){
            if(cmp.compare(e,max) > 0){
                max = e;
            }
        }
        return max;

    }
    public static <T> T min(List<T> list, Comparator<? super T> cmp){
        T min = list.getFirst();
        for(T e : list){
            if(cmp.compare(e,min) < 0){
                min = e;
            }
        }
        return min;
    }

}
