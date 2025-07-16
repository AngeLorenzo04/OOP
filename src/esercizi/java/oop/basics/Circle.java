package oop.basics;

/**
 * Class representing a circle
 */
public class Circle {
    private final double radius;
    private final Point center;

    /**
     * subClass representing a Point
     */
    public static class Point {
        double x;
        double y;

        Point(double x, double y){
            this.x = x;
            this.y = y;
        }

        /**
         * Method to get the distance from a point
         * @param p Point Type that represent the target point
         * @return  Double the distance from this point to point p
         */
        double getDistance(Point p){
            return Math.sqrt(Math.pow(p.x - this.x,2) + Math.pow(p.y - this.y,2));
        }

        /**
         * Translate this point
         * @param dx Variation on the x
         * @param dy Variation on the y
         */
        void translate(int dx, int dy){
            x = x + dx;
            y = y + dy;
        }

        @Override
        public String toString() {
            return "(" + Double.toString(x) + "," + Double.toString(y) + ")";
        }
    }
    /**
     *
     * @return the radius of the circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     *
     * @return a Point type representing the center
     */
    public Point getCenter() {
        return center;
    }

    /**
     *  Method to create a New Circle
     * @param center Point type representing the center
     * @param radius Integer type representing the radius
     */
    public Circle(Point center, int radius){
        this.center = center;
        this.radius = radius;
    }

    /**
     *
     * @return Perimeter of the circle
     */
    public double GetPerimeter(){
        return 2* Math.PI * this.radius;
    }

    /**
     *
     * @return The area of the circle
     */
    public double GetArea(){
        return Math.PI* Math.pow(this.radius,2);
    }

    /**
     *
     * @param point Point type that represent a point
     * @return Boolean, true if the point is in the circle fals otherwise
     */
    public Boolean Contains(Point point){

        return !(center.getDistance(point) > radius);
    }

    /**
     *  Metodo per spostare il cerchio
     * @param dx Variazione delle coordinate x del centro
     * @param dy Variazione delle coordinate y del centro
     *
     */
    public void Translate(int dx, int dy){
        center.translate(dx,dy);
    }

    @Override
    public String toString() {
        return "Circle{" + "center=" + center.toString() + ", radius=" + Double.toString(radius) + '}';
    }

    public static void main(String[] args) {
        Circle c = new Circle(new Point(0,0),1);
        System.out.println("Stato 0: "  + c.toString() );


        System.out.println("Contiene (0,2) risposta attesa: false\noutput: "  + Boolean.toString(c.Contains(new Point(0,2))));
        System.out.println("Perimeter center: (0,0) radius: 1\noutput: "  + Double.toString(c.GetPerimeter()));
        System.out.println("Area center: (0,0) \noutput: "  + Double.toString(c.GetArea()));
        c.Translate(2,3);
        System.out.println("Translaate: "  + c.toString());



    }

}
