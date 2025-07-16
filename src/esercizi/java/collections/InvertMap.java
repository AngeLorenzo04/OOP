package collections;

import java.util.HashMap;
import java.util.Map;

public class InvertMap {

    public static Map<String, Integer> invertMap(Map<Integer, String> src){
        Map<String,Integer> out = new HashMap<>();
        for(Integer key : src.keySet()){
            out.put(src.getOrDefault(key,""),key);
        }
        return out;
    }

}
