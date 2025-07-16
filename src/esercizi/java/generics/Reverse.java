package generics;

import java.util.List;

public class Reverse {

    public static <T> void reverse(List<T> list){

        for(int i = 0 ; i < Math.floor((double) list.size() / 2); i++){
            T e  = list.get(list.size() - i - 1);
            T tmp  = list.get(i);
            list.set(i,e);
            list.set(list.size() - i - 1, tmp);
        }

    }

    /*
        [1,2,3,4,5]
        [5,2,3,4,1]
        [5,4,3,2,1]
     */

}
