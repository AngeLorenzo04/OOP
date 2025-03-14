package oop.basic;
import java.util.Objects;

public class RationalNumber {
    final int numerator;
    final int denominator;

    /**
     * constructor RationalNumber
     * @param numerator numeratore
     * @param denominator denominatore
     *
     */
    public RationalNumber(int numerator, int denominator){
        int mcd = greatestCommonDivisor(numerator,denominator);
        this.numerator = numerator/mcd;
        this.denominator = denominator/mcd;
    }
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    public RationalNumber add(RationalNumber o){
        int mcm = leastCommonMultiple(denominator,o.denominator);
        int newNumerator = (numerator * (mcm / o.denominator) + o.numerator * (mcm / denominator));
        return new RationalNumber(newNumerator,mcm);
    }
    public RationalNumber multiply(RationalNumber o){
        int newDenominator = o.denominator * denominator;
        int newNumerator = o.numerator * numerator;
        return new RationalNumber(newNumerator,newDenominator);
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

    @Override
    public String toString() {
        return "RationalNumber{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
