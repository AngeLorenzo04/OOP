package exceptions;

import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckString {

    public static void checkString(String s) throws ParseException {
        if (s.length() < 2 || s.length() % 2 != 0) {
            throw new ParseException(s, 0);
        }
       for(int i = 0; i < s.length(); i++){
           if(i%2 == 0 && Character.isDigit(s.charAt(i))){
               throw new ParseException(s,0);
           }
           if(i%2 != 0 && Character.isLetter(s.charAt(i))){
               throw new ParseException(s,1);
           }

       }
    }

}
