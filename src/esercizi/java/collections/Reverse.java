package collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Reverse {
    public static void reverse(List<String> sentence){


        Deque<String> deque = new LinkedList<>();

        while (!sentence.isEmpty()){
            deque.push(sentence.removeFirst());
        }
        while (!deque.isEmpty()){
            sentence.add(deque.pollFirst());
        }

    }
}
