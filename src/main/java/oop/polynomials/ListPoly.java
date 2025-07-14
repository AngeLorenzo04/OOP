package oop.polynomials;

import java.util.ArrayList;

public class ListPoly extends AbstractPoly {

    ArrayList<Double> coefficients;

    public ListPoly(double[] coefficients){
        this.coefficients = new ArrayList<>();
        for(double coefficient : coefficients) {
            this.coefficients.add(coefficient);
        }
    }

    @Override
    public double coefficient(int index) {
        return coefficients.get(index);
    }

    @Override
    public Poly derivative() {
        return new ListPoly(derive());
    }

    @Override
    public double[] coefficients() {
        double[] out = new double[coefficients.size()];
        for(int i = 0; i < coefficients.size(); i ++){
            out[i] = coefficients.get(i);
        }
        return out;
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

}
