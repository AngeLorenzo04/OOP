package string;

public class GoodAtTheBeginning {


    public static boolean goodAtTheBeginning(String s){

        StringBuilder sb = new StringBuilder(s);

       return sb.substring(0,4).equals("good");

    }


    public static void main(String[] args) {

        System.out.println("goodAtTheBeginning(\"good Sweet\") -> " + Boolean.toString(goodAtTheBeginning("good Sweet")));
        System.out.println("goodAtTheBeginning(\" good Sweet\") -> " + Boolean.toString(goodAtTheBeginning(" good Sweet")));

    }

}
