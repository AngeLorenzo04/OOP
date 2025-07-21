package oop.basic;

public class  ClickCounter {

    private int value = 0;

    public int getValue(){
        return value;
    }

    public void click(){
        value += 1;
    }

    public void undo(){
        if(value > 0) value -= 1;
    }

    public void reset(){
        value = 0;
    }

}
