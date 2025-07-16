package collections;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvertMapTest {

    @Test
    void invertMap() {
        assertEquals(Map.of("Hello", 1, "World", 3), InvertMap.invertMap(Map.of(1, "Hello", 3, "World")));
        assertEquals(Set.of("Hello"), InvertMap.invertMap(Map.of(1, "Hello", 3, "Hello")).keySet());
    }
}