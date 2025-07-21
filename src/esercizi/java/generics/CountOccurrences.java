package generics;

import java.util.Objects;

public class CountOccurrences {

    public static <T> int countOccurrencesPlain(T[] src, T item){

        int i = 0;
        if(item == null){
            for(T e : src){
                if(e == null){
                    i++;
                }
            }
            return i;
        }
        for(T e : src){
            if(item == e){
                i++;
            }
        }
        return i;

    }
    public static <T> int countOccurrencesObjects(T[] src, T item){
        int i = 0;
        for(T e : src){
            if(Objects.equals(e,item)) i++;
        }
        return i;
    }

}
