package exceptions;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class FilterItems {

    public static List<String> filterItems(List<String> strings){
        List<String> out = new ArrayList<>();
        for(String string : strings){

            try {
                CheckString.checkString(string);
                out.add(string);
            } catch (ParseException ignore) {
            }

        }


        return out;
    }

}
