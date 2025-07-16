package collections;

import java.util.HashSet;
import java.util.Set;

public class RecurringChars {

    public static Set<Character> recurringChars(String string){

        Set<Character> duplicati = new HashSet<>();
        Set<Character> visto = new HashSet<>();


        for(Character c : string.toCharArray()){

            if(!visto.contains(c)){
                visto.add(c);
            }else{
                duplicati.add(c);
            }

        }

        return duplicati;
    }

}
