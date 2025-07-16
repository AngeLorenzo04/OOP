package exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.IllegalFormatException;
import java.util.Locale;

public class CheckIntervalBetweenDates  {

    public static boolean checkIntervalBetweenDates(String begin, String end) throws DateTimeParseException {

        LocalDate inizio = LocalDate.parse(begin);
        LocalDate fine = LocalDate.parse(end);

        return inizio.isBefore(fine);

    }

}
