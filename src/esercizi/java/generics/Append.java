package generics;

import java.util.List;

public class Append {

    public static <T> void append(List<T> dst, List<T> src){

        if(src.isEmpty()){
            return;
        }

        dst.addAll(src);

    }

}
