package funcional;

import java.util.List;
import java.util.stream.Collectors;

public class NoYY {

    public static List<String> noYY(List<String> strings){
        return strings.stream().map(s -> new StringBuilder(s).append("y").toString()).filter(s -> !s.contains("yy")).collect(Collectors.toList());
    }

}
