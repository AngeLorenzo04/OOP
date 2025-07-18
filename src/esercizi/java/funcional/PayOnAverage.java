package funcional;

import java.util.Map;
import java.util.stream.Collectors;

public class PayOnAverage {

    public static Map<String, Double> payOnAverage(Map<String, Double> fees){
        return fees.entrySet().stream().collect(Collectors.groupingBy(
                e -> e.getKey().substring(0,3),
                Collectors.averagingDouble(Map.Entry::getValue
                )
        ));
    }

}
