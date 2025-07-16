package collections;

import java.util.Iterator;
import java.util.List;

public class DownSize {
    public static void downsize(List<String> list, int n) {

        int i = 1;
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            it.next();
            if( i % n == 0){
                it.remove();
            }
            i++;
        }

    }
}
