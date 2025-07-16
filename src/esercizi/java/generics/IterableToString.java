package generics;

public class IterableToString {

    public static <E> String iterableToString(Iterable<E> src){

        StringBuilder sb = new StringBuilder();

        for(E obj : src){
            sb.append(obj.toString());
            sb.append(", ");
        }

        return sb.toString();

    }

}
