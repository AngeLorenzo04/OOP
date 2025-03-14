package oop.basic;

public class ClickCounter {
    private int counter = 0;

    public int getValue (){
        return counter;
    }

    public void click () {
        counter++;
    }

    public void undo(){
        if(counter > 0){counter--;}
    }

    public void restart(){
        counter = 0;
    }


}