package string;

import java.util.Arrays;

public class Concatenate {

    public static String concatenate(String[] strings){

        StringBuilder sb = new StringBuilder();

        for(String string : strings){
            sb.append(string);
        }

        return sb.toString();

    }


    public static void main(String[] args) {

        String[] arr1 = new String[]{"Hello", " ","World!"};
        String[] arr2 = new String[]{"H", "e","llo"," ","World!"};
        String[] arr3 = new String[]{"H", "e","llo"," ","World!"};
        System.out.println("concatenate([\"Hello\", \" \", \"World!\"]) → " + concatenate(arr1));
        System.out.println("concatenate([H\", \"e\", \"llo\", \" \", \"World!\"]) → " + concatenate(arr2));
        System.out.println("concatenate([\"Hello World\", \"!\"]) → " + concatenate(arr3));

    }
}
