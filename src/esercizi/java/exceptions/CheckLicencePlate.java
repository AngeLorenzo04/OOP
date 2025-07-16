package exceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckLicencePlate {

    public static void checkLicencePlate(String licence){

        Pattern pattern = Pattern.compile("[a-zA-Z]{2}[0-9]{3}[a-zA-Z]{2}");
        Matcher matcher = pattern.matcher(licence);

        if(licence.length() != 7 || !matcher.find()) throw new IllegalArgumentException("TARGA FAKE");

    }

}
