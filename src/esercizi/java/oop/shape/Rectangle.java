package oop.shape;

import java.awt.*;
import java.awt.geom.Point2D;

public class Rectangle extends AbstractShape{


    private Point upperLeft;
    private Point bottomRight;


    protected Rectangle(String id, String color,Point upperLeft, Point bottomRight) {
        super(id, color);
        this.bottomRight = bottomRight;
        this.upperLeft = upperLeft;
    }

    @Override
    public double getArea() {
        return (bottomRight.getX() - upperLeft.getX()) * (upperLeft.getY() - bottomRight.getY());
    }

    @Override
    public double getPerimeter() {
        return ((bottomRight.getX() - upperLeft.getX()) + (upperLeft.getY() - bottomRight.getY())) * 2.0;
    }

    @Override
    public void move(Point p) {
        upperLeft = new Point((int)(upperLeft.getX() + p.getX()), (int)(upperLeft.getY() + p.getY()));
        bottomRight = new Point((int)(bottomRight.getX() + p.getX()), (int)(bottomRight.getY() + p.getY()));
    }

    @Override
    public void resize(double size) {
        double newX = upperLeft.getX() + ((bottomRight.getX() - upperLeft.getX()) * size);
        double newY = upperLeft.getY() - ((upperLeft.getY() - bottomRight.getY()) * size);
        bottomRight.setLocation(newX, newY);
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "upperLeft=" + upperLeft + ", bottomRight=" + bottomRight + ", id='" + id + '\'' + ", color=" + color + '}';
    }
}

/**
 *
 *
 *  *-----------I
 *  I           I
 *  I           I
 *  I___________*
 *
 */