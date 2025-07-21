package oop.polynomials;

import java.util.ArrayList;
import java.util.List;

public class ListPoly extends AbstractPoly {

    ArrayList<Double> coefficients;

    public ListPoly(double[] coefficients){
        this.coefficients = new ArrayList<>();
        for(double c : coefficients){
            this.coefficients.add(c);
        }
    }

    @Override
    public double coefficient(int i){
        return coefficients.get(i);
    }

    @Override
    public double[] coefficients() {
        double[] out = new double[coefficients.size()];
        for(int i = 0 ; i < coefficients.size(); i++){
            out[i] = coefficients.get(i);
        }
        return out;
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        return new ListPoly(derive());
    }


}
