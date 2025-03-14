package oop;

import oop.basic.ClickCounter;
import oop.basic.RationalNumber;

public class Main {
    public static void main(String[] args) {
        RationalNumber r = new RationalNumber(1,4);
        RationalNumber r1 = new RationalNumber(1,2);
        RationalNumber rsum = r.add(r1);

        System.out.println(rsum);
    }
}
