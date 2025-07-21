package oop.basic;

import java.util.Objects;

public class RationalNumber {

    private final int numerator;
    private final int denominator;

    public RationalNumber(int numerator, int denominator) {
        int mcd = greatestCommonDivisor(numerator,denominator);
        this.numerator = numerator / mcd;
        this.denominator = denominator / mcd;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public RationalNumber add(RationalNumber o){
        int denominatorResult = leastCommonMultiple(this.denominator, o.getDenominator());
        int numeratorResult =  this.numerator* (denominatorResult/this.denominator ) + o.getNumerator() * (denominatorResult/o.getDenominator());
        return new RationalNumber(numeratorResult,denominatorResult);
    }


    public RationalNumber multiply(RationalNumber o){
        int denominatorResult = o.denominator * this.denominator;
        int numeratorResult = o.numerator * this.numerator;

        return new RationalNumber(numeratorResult, denominatorResult);
    }

    @Override
    public boolean equals(Object o){

        if(o == this){
            return true;
        }
        if(o.getClass() != this.getClass()){
            return false;
        }
        return ((RationalNumber) o).numerator == this.numerator &&
                ((RationalNumber) o).denominator == this.denominator;
    }


    @Override
    public int hashCode(){
        return Objects.hash(this.denominator, this.denominator);
    }


    @Override
    public String toString(){

        return "RationalNumber{numerator="+this.numerator + ", denominator=" + this.denominator+"}";
    }

    public static int greatestCommonDivisor(int a, int b) {
        int max = Math.max(Math.abs(a), Math.abs(b));
        int min = Math.min(Math.abs(a), Math.abs(b));

        int rest = max % min;
        if (max % min == 0) {
            return min;
        } else {
            return greatestCommonDivisor(min, rest);
        }
    }

    public static int leastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }

}
