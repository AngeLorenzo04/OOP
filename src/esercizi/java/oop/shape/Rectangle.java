package oop.shape;

import java.awt.*;

public class Rectangle extends AbstractShape{

    private Point upperLeft;
    private Point bottomRight;

    protected Rectangle(String id, String color) {
        super(id, color);
    }

    @Override
    public double getArea() {
        double lenLato1 = upperLeft.getY() + bottomRight.getY();
        double lenLato2 = upperLeft.getX() + bottomRight.getX();

        return lenLato1 * lenLato2;
    }

    @Override
    public double getPerimeter() {
        double lenLato1 = upperLeft.getY() + bottomRight.getY();
        double lenLato2 = upperLeft.getX() + bottomRight.getX();
        return (lenLato1+lenLato2) * 2;
    }

    @Override
    public void move(Point p) {
        upperLeft.translate(p.x,p.y);
        bottomRight.translate(p.x,p.y);
    }

    @Override
    public void resize(double size) {
        double newX = upperLeft.getX() + ((bottomRight.getX() - upperLeft.getX()) * size);
        double newY = upperLeft.getY() - ((upperLeft.getY() - bottomRight.getY()) * size);
        bottomRight.setLocation(newX, newY);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "upperLeft=" + upperLeft + ", bottomRight=" + bottomRight + ", id='" + id + '\'' + ", color=" + color + '}';
    }


}
