package generics;

public class PairSameType <K> {
    
    K first;
    K second;
    
    public PairSameType(K first, K second){
        this.first = first;
        this.second = second;
    }

    public void setFirst(K first) {
        this.first = first;
    }

    public void setSecond(K second) {
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public K getSecond() {
        return second;
    }
    
    public void swap(){
        K tmp = first;
        first = second;
        second = tmp;
    }
    
}
