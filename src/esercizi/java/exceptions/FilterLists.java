package exceptions;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class FilterLists {

    public static List<List<String>> filterLists(List<List<String>> lists){

        List<List<String>> listOfList = new ArrayList<>();
        for(List<String> list: lists){
            try {
                for(String s : list){
                    CheckString.checkString(s);
                }
                listOfList.add(list);
            } catch (ParseException ignore) {
            }
        }
        return listOfList;

    }

}
