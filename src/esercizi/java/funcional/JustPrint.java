package funcional;

import java.util.List;
import java.util.Map;

public class JustPrint {

    public static <T> void justPrintList(List<T> list){
        list.forEach(s -> System.out.println("Hello " + s));
    }
    public static <K,V> void justPrintMap(Map<K, V> map){
        map.forEach((k,v) -> System.out.println("K: " + k + " Value: " + v));
    }

}
