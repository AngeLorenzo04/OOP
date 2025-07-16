package collections;

import java.util.List;

public class SpeedTest {

    public static long insertBeginning(List<String> list, String item, int times){
        long inizio = System.nanoTime();
        list = list.reversed();
        for(int i = 0; i < times; i++){
            list.add(item);
        }
        list = list.reversed();

        return System.nanoTime() - inizio;
    }

    public static long insertEnd(List<String> list, String item, int times){
        long inizio = System.nanoTime();
        for(int i = 0; i < times; i++){
            list.add(item);
        }
        return System.nanoTime() - inizio;

    }

}
