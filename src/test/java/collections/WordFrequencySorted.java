package collections;

import java.util.*;

public class WordFrequencySorted {


    public static Map<String ,Integer> sortMapbBy(Map<String,Integer> map, Comparator<Map.Entry<String, Integer>> comparator, int limit){

      List<Map.Entry<String ,Integer>> entries = new ArrayList<>(map.entrySet());
      entries.sort(comparator);
      entries.subList(0,limit);
      
      Map<String,Integer> dist = new HashMap<>();
      for (Map.Entry<String,Integer> e : entries){
          dist.put(e.getKey(),e.getValue());
      }
      
      return dist;
        
        
    }
    public static Map<String, Integer> mostFrequent(Map<String, Integer> map, int limit){
        return sortMapbBy(map, (e1, e2) -> e2.getValue() - e1.getValue(), limit );
    }
    public static Map<String, Integer> lessFrequent(Map<String, Integer> map, int limit){
        return sortMapbBy(map, (e1, e2) -> e1.getValue() - e2.getValue(), limit );

    }

}
