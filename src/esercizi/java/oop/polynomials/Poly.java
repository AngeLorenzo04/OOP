package oop.polynomials;

public interface Poly {


    double coefficient(int i);
    double[] coefficients();
    int degree();
    Poly derivative() ;

}
