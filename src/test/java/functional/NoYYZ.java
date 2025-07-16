package functional;

import java.util.List;
import java.util.stream.Collectors;

public class NoYYZ {

    public static List<String> noYYZ(List<String> strings){
        return strings.stream().map(s -> s + "y").filter(s -> !s.contains("yy")).
                toList().stream().peek(s -> {if(s.startsWith("s")) System.out.println(s);})
                .collect(Collectors.toList());
    }
}
