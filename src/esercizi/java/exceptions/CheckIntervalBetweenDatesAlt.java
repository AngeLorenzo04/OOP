package exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class CheckIntervalBetweenDatesAlt {

    public static boolean checkIntervalBetweenDatesAlt(String begin, String end){

        try {
            LocalDate intizio = LocalDate.parse(begin);
            LocalDate fine = LocalDate.parse(end);

            return intizio.isBefore(fine);
        } catch (DateTimeParseException e) {
            return false;
        }

    }
}
