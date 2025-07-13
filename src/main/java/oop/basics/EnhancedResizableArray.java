package oop.basics;

import java.util.Arrays;

public class EnhancedResizableArray {

    public static final int DEFALUT_CAPACITY = 3;
    private int[] n;

    public EnhancedResizableArray(){
        this.n = new int[DEFALUT_CAPACITY];
    }

    public int get(int index){
        if(index > n.length || index < 0){
            throw new IllegalArgumentException("Indice non accettabile");
        }
        return n[index];
    }

    public void set(int index, int value){
        if(index > n.length){
            int[] tmp = new int[index * 2];
            System.arraycopy(n, 0, tmp, 0, n.length);
            n=tmp;
        }
        n[index] = value;
    }

    public boolean contain(int value){

        for(int val : n){
            if(val == value){
                return true;
            }
        }
        return false;
    }

    public void fill(int value){
        Arrays.fill(n, value);
    }

    public int[] toArray(){
        return Arrays.copyOf(n,n.length);
    }

    public int length(){
        return n.length;
    }

}
