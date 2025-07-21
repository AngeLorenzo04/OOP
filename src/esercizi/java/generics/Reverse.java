package generics;

import java.util.List;

public class Reverse {

    public static <T> void reverse(List<T> list){

        for(int i = 0; i < Math.floor((double) list.size() /2); i++){

            T tmp = list.get(i);
            list.set(i,list.get(list.size() - i - 1));
            list.set(list.size() - i -1,tmp);

        }


    }


    /**
     *
     * [1,2,3,4]
     * [4,2,3,1]
     * [4,3,2,1]
     *
     * [1,2,3]
     * [3,2,1]
     *
     */

}
