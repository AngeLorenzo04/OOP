package oop.basics;

import java.awt.geom.Point2D;

/**
 *
 * Classe poligono
 */
public class Polygon {


    private Point2D.Double[]  vertici;

    /**
     * Costruttore Poligono
     * @param vertici tipo Point2D.Double[] almeno 3 punti
     */
    public Polygon(Point2D.Double[] vertici){
        if(vertici.length < 3){
            throw new IllegalArgumentException("Sono richiesti almeno 3 vertici");
        }
        this.vertici = vertici;
    }

    /**
     * Conta vertici
     * @return intero che rappresenta il numero di vertici
     */

    public int getVerticiCount(){
        int count = 0;
        for(Point2D.Double vertice : vertici){
            count++;
        }
        return count;
    }

    /**
     * Calcola perimetro del poligono
     * @return un double che rappresenta il perimetro del poligono
     */
    public double getPerimeter(){
        double perimeter = 0.0;
        for (int i = 0; i < vertici.length; i++) {
            int next = (i + 1) % vertici.length;
            perimeter += Math.hypot(vertici[i].x - vertici[next].x, vertici[i].y - vertici[next].y);
        }
        return perimeter;
    }

    /**
     * Calcola l'area del poligono
     * @return double che rappresenta l'area del poliono
     */
    public double getArea(){

        double area = 0.0;
        for (int i = 0; i < vertici.length; i++) {
            int next = (i + 1) % vertici.length;
            area += (vertici[i].x * vertici[next].y) - (vertici[i].y * vertici[next].x);
        }
        return Math.abs(area / 2.0);

    }

    public int getVerticesCount() {
        return 0;
    }
}
