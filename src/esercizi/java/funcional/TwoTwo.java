package funcional;

import java.util.List;
import java.util.stream.Collectors;

public class TwoTwo {
    public static List<Integer> twoTwo(List<Integer> nums){
        return nums.stream().map(n -> n*2).filter(n-> !Integer.toString(n).endsWith("2")).collect(Collectors.toList());
    }
}
