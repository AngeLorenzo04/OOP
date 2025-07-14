package oop.shape;

public abstract class AbstractShape implements Computable,Movable,Resizable {
    
    protected String id;
    protected String color;

    protected AbstractShape(String id, String color){
        this.id = id;
        this.color = color;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    
}
