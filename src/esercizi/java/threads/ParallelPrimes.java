package threads;

import javax.naming.ldap.PagedResultsControl;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ParallelPrimes {


    public static class PrimeEngine implements Callable<List<Integer>> {
        int start;
        int end;

        public PrimeEngine(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public List<Integer> call() {
            List<Integer> result = new ArrayList<>();
            for (int i = start; i < end; i++) {
                if (isPrime(i)) {
                    result.add(i);
                }
            }
            return result;
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = new ScheduledThreadPoolExecutor(4);

        List<Callable<List<Integer>>> task = new ArrayList<>();

        for(int i = 0; i < 6; i++){
            task.add(new PrimeEngine(i*1000,(i + 1) * 1000));
        }

        List<Future<List<Integer>>> futures = executor.invokeAll(task);

        Thread.sleep(1000);

        for(Future<List<Integer>> future : futures){
            System.out.println(future.get());
        }

    }

}
