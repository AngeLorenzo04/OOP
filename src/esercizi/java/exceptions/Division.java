package exceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Division {

    public static double division(double a, double b){
        if(b == 0){
            throw new IllegalArgumentException("IMPOSSIBILE DIVIDERE PER 0");
        }

        return a/b;

    }

    public static void main(String[] args) {
        System.out.println(Double.toString(division(4,1)));

        List<String> myList = new ArrayList<>();

        myList.add("s");
        myList.add("a");
        myList.add("l");
        myList.add("v");
        myList.add("e");

        Iterator<String> it = myList.iterator();

        while (it.hasNext()){
            String str = it.next();
            if(str.equals("l")) it.remove();
            System.out.println(it.next());
        }

        for(String str: myList){
            System.out.println(str);
        }


    }

}
