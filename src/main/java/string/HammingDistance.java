package string;

public class HammingDistance {

    public static int hammingDistance(String s1, String s2){


        if(s1.length() != s2.length()){
            return  -1;
        }

        int cont = 0;

        for(int i = 0; i < s1.length(); i++){

            if(s1.charAt(i) != s2.charAt(i)){
                cont++;
            }

        }
        return cont;
    }


    public static void main(String[] args) {

        System.out.println("hammingDistance(\"nicola\", \"n1cola\") → " + Integer.toString(hammingDistance("nicola","n1cola")));
        System.out.println("ammingDistance(\"nicola\", \"nicola\") → " + Integer.toString(hammingDistance("nicola","nicola")));
        System.out.println("hammingDistance(\"nicola\", \"zzzzzz\") → " + Integer.toString(hammingDistance("nicola","zzzzzz")));
        System.out.println("hammingDistance(\"nicola\", \"nicol\") → " + Integer.toString(hammingDistance("nicola","nicol")));
        System.out.println("hammingDistance(\"\", \"nicol\") → " + Integer.toString(hammingDistance("","nicol")));

    }

}
