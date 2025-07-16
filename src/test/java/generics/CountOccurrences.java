package generics;

import java.util.Objects;

public class CountOccurrences {

    public static <T> int countOccurrencesPlain(T[] src, T item){

        int count  = 0;
        for(T e : src){
            if(e == null && item == null) count++;
            if( e!= null && e.equals(item)) count++;
        }
        return count;
    }
    public static <T> int countOccurrencesObjects(T[] src, T item){

        int count  = 0;
        for(T e : src){
            if(Objects.equals(e,item)) count++;
        }
        return count;

    }

}
