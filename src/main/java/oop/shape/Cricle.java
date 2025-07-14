package oop.shape;

import java.awt.*;

public class Cricle extends AbstractShape {

    private Point center;
    private double radius;

    protected Cricle(String id, String color) {
        super(id, color);
    }


    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public void move(Point p) {
        center.x += p.x;
        center.y += p.y;
    }

    @Override
    public void resize(double size) {
        radius = size;
    }
}
