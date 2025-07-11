package string;

public class SumDigits {

    public static int sumDigits(String string){

            int sum = 0;

            for(char c : string.toCharArray()){

                if( Character.isDigit(c)){

                    sum += Character.getNumericValue(c);

                }

            }

            return sum;
    }


    public static void main(String[] args) {

        System.out.println("sumDigits(\"aa1bc2d3\") → " + Integer.toString(sumDigits("aa1bc2d3")));
        System.out.println("sumDigits(\"aa11b33\") → " + Integer.toString(sumDigits("aa11b33")));
        System.out.println("sumDigits(\"Chocolate\")→ " + Integer.toString(sumDigits("Chocolate")));


    }




}
