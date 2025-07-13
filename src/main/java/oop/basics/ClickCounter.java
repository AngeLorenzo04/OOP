package oop.basics;

public class ClickCounter {

    private int value = 0;

    public int getValue() {
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public void click() {
        this.value = getValue() + 1;
    }

    public void undo() {
        this.value = getValue() - 1;
    }

    public void reset() {
        this.value = 0;
    }


    public static void main(String[] args) {

        ClickCounter cc = new ClickCounter();
        System.out.println("count value step 1: " + Integer.toString(cc.getValue()));

        cc.click();
        System.out.println("count value step 2: " + Integer.toString(cc.getValue()));

        cc.setValue(4);
        System.out.println("count value step 3: " + Integer.toString(cc.getValue()));

        cc.reset();
        System.out.println("count value step 4: " + Integer.toString(cc.getValue()));

        for(int i = 0;  i < 10; i++){
            cc.click();
        }
        System.out.println("count value step 5: " + Integer.toString(cc.getValue()));




    }

}
