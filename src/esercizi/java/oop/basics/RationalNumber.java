package oop.basics;


import java.util.Objects;
/**
 * A rational number supporting addition and multiplication with other rational numbers.
 */
public final class RationalNumber {


    private final int Numerator;
    private final int Denominator;

    /**
     * Constructs and initializes a new rational number with the specified numerator and denominator
     * @param Numerator the numerator ot the rational
     * @param Denominator the denominator ot the rational
     */
    public RationalNumber(int Numerator, int Denominator){
        this.Numerator = Numerator;
        this.Denominator = Denominator;
    }

    /**
     *
     * @return Return the denominator
     */
    public int getDenominator() {
        return Denominator;
    }

    /**
     *
     * @return Return the Numerator
     */
    public int getNumerator() {
        return Numerator;
    }

    /**
     *
     * @param o
     * @return a new RationalNumber representing the sum
     */
    public RationalNumber add(RationalNumber o){
        int denominator;
        denominator = leastCommonMultiple(this.Denominator, o.Denominator);

        int numerator;
        numerator = (denominator / this.Denominator) * this.Numerator + (denominator / o.Denominator) * o.Numerator;

        return new RationalNumber(numerator,denominator);
    }

    /**
     *
     * @param o
     * @return New RationalNumber representing the product
     */
    public RationalNumber Multiply(RationalNumber o){
        int denominator;
        denominator = this.Denominator * o.Denominator;

        int numerator;
        numerator = this.Numerator * o.Numerator;

        denominator = denominator / greatestCommonDivisor(denominator,numerator);
        numerator = numerator / greatestCommonDivisor(numerator,denominator);

        return new RationalNumber(numerator,denominator);
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o == null || getClass() != o.getClass()){
            return false;
        }

        RationalNumber that = (RationalNumber) o;

        return  (Numerator == that.Numerator && Denominator == that.Denominator);
    }

    @Override
    public int hashCode(){
        return Objects.hash(Numerator,Denominator);
    }

    @Override
    public String toString() {

        return this.Numerator + "\\" + this.Denominator;

    }

    /**
     * Return the greatest common divisor of two integer numbers
     * @param a the first integer number
     * @param b the second integer number
     * @return the greatest common divisor
     */
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

    /**
     * Return the least common multiple of two integer numbers
     * @param a the first integer number
     * @param b the second integer number
     * @return the least common multiple
     */
    public static int leastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }


    public static void main(String[] args) {
        RationalNumber r = new RationalNumber(5,2);
        System.out.println("Stato 1: "  + r.toString() );

        RationalNumber sum = r.add(new RationalNumber(1,2));
        System.out.println("Stato 2: "  + sum.toString() );

        RationalNumber mul = r.Multiply(new RationalNumber(2,3));
        System.out.println("Stato 3: "  + mul.toString() );

    }



}
