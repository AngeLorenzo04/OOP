package collections;

import java.util.HashSet;
import java.util.Set;

public class Intersection {


    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second){

        Set<Integer> intersect = new HashSet<>();
        for(Integer e: first){
            if(second.contains(e)){
                intersect.add(e);
            }
        }

        return intersect;
    }
    public static Set<Integer> intersectionRetainAll(Set<Integer> first, Set<Integer> second){
        Set<Integer> intersect = new HashSet<>(first);
        intersect.retainAll(second);
        return intersect;
    }

}
