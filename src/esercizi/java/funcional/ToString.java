package funcional;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToString {

    public static <T> String toString(Stream<T> stream, int n){
        return stream.limit(n).map(Objects::toString).collect(Collectors.joining(","));
    }

}
