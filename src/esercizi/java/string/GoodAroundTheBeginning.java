package string;

public class GoodAroundTheBeginning {

    public static boolean goodAroundTheBeginning(String s){

        return new StringBuilder(s).substring(0,4).equals("good") || new StringBuilder(s).substring(1,5).equals("good");

    }

    public static void main(String[] args) {

        System.out.println("goodAtTheBeginning(\"_good Sweet\") -> " + Boolean.toString(goodAroundTheBeginning("_ good Sweet")));
        System.out.println("goodAtTheBeginning(\"good Sweet\") -> " + Boolean.toString(goodAroundTheBeginning("good Sweet")));

    }

}
