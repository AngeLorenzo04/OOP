package collections;

import oop.library.Library;
import java.util.HashSet;
import java.util.Set;

public class Eratosthenes {
    public static Set<Integer> eratosthenes(int n){
        Set<Integer> set = new HashSet<>();
        for(int i = 2; i <= n; i++){
            set.add(i);
        }

        for(int i = 2; i < Math.sqrt(n); i++){
            set.removeAll(multipli(i,n));
        }
        return set;
    }

    public static Set<Integer> multipli(int i, int limit){
        Set<Integer> multipli = new HashSet<>();
        for(int j = 2; i * j <= limit; j++){
            multipli.add(i*j);
        }
        return multipli;
    }
}
