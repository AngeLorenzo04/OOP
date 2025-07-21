package oop.basic;

import java.util.Arrays;

public class EnhancedResizableArray {

    public static int DEFAULT_CAPACITY = 4;
    private int[] v;

    public EnhancedResizableArray(){
        this.v = new int[DEFAULT_CAPACITY];
    }
    public int get(int i){
        return v[i];
    }
    public void set(int index, int value){

        if(index >= v.length) {
            int[] tmp = new int[index * 2];
            System.arraycopy(v,0,tmp,0,v.length);
            v = tmp;
        }
        v[index] = value;

    }
    public boolean contains(int value){
        for(int e : v){
            if( e == value){
                return true;
            }
        }
        return false;
    }

    public void fill(int value){
        Arrays.fill(v,value);
    }

    public int[] toArray() {
        return Arrays.copyOf(v, v.length);
    }

    public int length(){
        return v.length;
    }

}
