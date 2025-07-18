package threads;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class DayChangeCheck extends Thread {

    public DayChangeCheck (String name){
        super(name);
    }

    @Override
    public void run() {
        LocalDate startDate = LocalDate.now();
        System.out.println("today: " + startDate.toString());

        while (!interrupted()){
            LocalDate today = LocalDate.now();
            if(!today.equals(startDate)){
                System.out.println("Giorno aggiornato");
                startDate = today;
            }
            try {
                Thread.sleep(TimeUnit.MINUTES.toMillis(15));
            } catch (InterruptedException ignore) {}
        }

    }


    public static void main(String[] args) throws InterruptedException {
        DayChangeCheck t1 = new DayChangeCheck("T1");
        t1.start();
    }

}
