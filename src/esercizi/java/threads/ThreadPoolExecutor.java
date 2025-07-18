package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.random.RandomGenerator;

public class ThreadPoolExecutor {


    public static void main(String[] args) throws InterruptedException {

        final int MAX_TASKS = 8;
        ExecutorService executor = Executors.newFixedThreadPool(4);
        RandomGenerator rd = RandomGenerator.getDefault();

        for(int task = 0; task < MAX_TASKS; task++){

            int taskNumber = task;
            executor.submit( () -> {
                long start = System.nanoTime();
                System.out.printf("START thread=%s task=%d\n",
                        Thread.currentThread().getName(),
                        taskNumber);

                long sleep = rd.nextLong(1000);
                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException ignore) {
                }

                long stop = System.nanoTime();
                System.out.printf("STOP thread=%s task=%d t=%d ms\n",
                        Thread.currentThread().getName(),
                        taskNumber,
                        TimeUnit.NANOSECONDS.toMillis(stop - start));
            });


        }
        executor.shutdown();
    }

}
