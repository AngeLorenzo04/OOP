package oop.shape;

import java.awt.*;
import java.awt.geom.Point2D;

public class Circle extends AbstractShape{

    private Point center;
    private double radius;

    protected Circle(String id, String color, Point center, double radus) {
        super(id, color);
        this.center = center;
        this.radius = radus;
    }


    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI* radius;
    }

    @Override
    public void move(Point p) {
        center = new Point((int)(p.getX() + center.getX()),(int)( p.getY() + center.getY()));
    }

    @Override
    public void resize(double size) {
        radius *= size;
    }

    public void setCenter(Point p) {
        center = p;
    }

    public void setRadius(double radus) {
        this.radius = radus;
    }

    public double getRadius() {
        return radius;
    }

    public Point2D getCenter() {
        return center;
    }

    @Override
    public String toString() {

        return "Circle{" + "center=" + center + ", radius=" + radius + ", id='" + id + '\'' + ", color=" + color + '}';
    }
}
