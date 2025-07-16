package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

    public static List<Integer> removeDuplicates(List<Integer> list){
        return new ArrayList<>(new HashSet<Integer>(list));
    }
}
