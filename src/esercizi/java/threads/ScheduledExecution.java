package threads;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecution extends Thread{

    public ScheduledExecution(String name){
        super(name);
    }

    @Override
    public void run(){

        while (!isInterrupted()){
            try {
                sleep(TimeUnit.SECONDS.toMillis(1L));
            } catch (InterruptedException ignore) {}

            System.out.println(LocalTime.now() + ": Hello!");

        }

    }

    public static void main(String[] args) {

        ScheduledExecution t1 = new ScheduledExecution("T1");
        //t1.start();

        ScheduledExecutorService scheduler =  Executors.newSingleThreadScheduledExecutor();
        scheduler.scheduleAtFixedRate(() -> {

            System.out.println( LocalTime.now() + ": Hello!");

            },0,1000,TimeUnit.MILLISECONDS);

    }

}
