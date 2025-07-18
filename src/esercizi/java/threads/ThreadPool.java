package threads;

import java.util.concurrent.TimeUnit;
import java.util.random.RandomGenerator;

public class ThreadPool extends Thread{
    public static final int MAX_TASKS = 8;

    public static void main(String[] args) throws InterruptedException {

        Thread[] threadPool = new Thread[MAX_TASKS];
        RandomGenerator rd = RandomGenerator.getDefault();

        for(int task = 0; task < MAX_TASKS; task++){

            int taskNumber = task;
            threadPool[task] = new Thread(() -> {
                long start = System.nanoTime();
                System.out.printf("START thread=%s task=%d\n",
                        Thread.currentThread().getName(),
                        taskNumber);

                long sleep = rd.nextLong(1000);
                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException ignore) {}

                long stop = System.nanoTime();
                System.out.printf("STOP thread=%s task=%d t=%d ms\n",
                        Thread.currentThread().getName(),
                        taskNumber,
                        TimeUnit.NANOSECONDS.toMillis(stop - start));
            });


        }
        // starting child threads
        for (int i = 0; i < MAX_TASKS; i++) {
            threadPool[i].start();
        }

        // waiting child threads
        for (int i = 0; i < MAX_TASKS; i++) {
            threadPool[i].join();
        }

    }


}
