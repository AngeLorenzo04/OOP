package generics;

public class PairUtil <K,V>{

    public static <K, V> Pair<V, K> swap(Pair<K, V> src){

        Pair<V,K> out = new Pair<>(null,null);
        out.setSecond(src.getFirst());
        out.setFirst(src.getSecond());
        return out;

    }

}
