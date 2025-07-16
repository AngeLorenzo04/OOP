package generics;

import java.util.TreeMap;
import java.util.TreeSet;

public class BinarySearch {

    public static <T extends Comparable<T>> int find(T[] array, T key){

//        TreeMap<T,Integer> treeMap = new TreeMap<>();
//        int i = 0;
//        for(T t : array){
//            treeMap.put(t,i++);
//        }
//
//
//        return treeMap.getOrDefault(key,-1);


        return binarysearch(array,key,array.length - 1,0);

    }

    public static <T extends Comparable<T>> int binarysearch(T[] array, T key, int destra, int sinistra){
        if(destra < sinistra){
            return -1;
        }

        int centro = (destra + sinistra) >>> 1;
        int dif = key.compareTo(array[centro]);

        if(dif == 0){
            return centro;
        }

        if(dif > 0){
           return binarysearch(array,key,centro - 1, sinistra);
        }
        return binarysearch(array,key,destra,centro + 1);

    }


}
