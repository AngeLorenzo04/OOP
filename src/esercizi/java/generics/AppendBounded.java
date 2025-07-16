package generics;

import java.util.List;

public class AppendBounded {

    public static <T, S extends T> void append(List<T> dst, List<S> src) {

            dst.addAll(src);
    }
}
