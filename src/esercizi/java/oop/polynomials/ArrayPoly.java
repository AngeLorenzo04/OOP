package oop.polynomials;

import java.util.Arrays;

public class ArrayPoly extends AbstractPoly{

    private double[] coefficients;

    public ArrayPoly(double[] coefficients){
        this.coefficients = coefficients;
    }

    @Override
    public double coefficient(int index) {
        return coefficients[index];
    }

    @Override
    public double[] coefficients() {
        return Arrays.copyOf(coefficients,coefficients.length);
    }

    @Override
    public int degree() {
        return coefficients.length - 1;
    }

    @Override
    public Poly derivative() {
        return new ArrayPoly(derive());
    }
}
