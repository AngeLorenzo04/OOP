package threads;

import java.util.*;
import java.util.random.RandomGenerator;

public class ProducerConsumerSafe {
    static int pushedItem = 0;
    static int fetchedItem = 0;
    static RandomGenerator rd = RandomGenerator.getDefault();

    public static class Producer extends Thread{
        final Deque<Integer> queue;

        public Producer(String name, Deque<Integer> queue){
            super(name);
            this.queue = queue;
        }

        @Override
        public void run(){
            while (!isInterrupted()) {
                int item = rd.nextInt(10);
                synchronized (queue){
                    queue.push(item);
                    pushedItem++;
                }
            }
        }
    }


    static public class Consumer extends Thread{
        final Deque<Integer> queue;

        public Consumer(String name, Deque<Integer> queue){
            super(name);
            this.queue = queue;
        }

        @Override
        public void run(){
            int fetched;
            while (!isInterrupted()) {

                synchronized (queue){
                    fetched = queue.removeFirst();
                }
                fetchedItem++;
                System.out.println("Numero fetch: " + fetchedItem + " Item: " + fetched);
            }
            System.out.println("Numero Item fetchati: " + fetchedItem);
        }

    }


    public static void main(String[] args) throws InterruptedException {
        Deque<Integer> dq = new LinkedList<>();
        Producer producer = new Producer("produttore",dq);
        Consumer consumer = new Consumer("consumatore",dq);

        producer.start();
        consumer.start();

        Thread.sleep(100);

        producer.interrupt();
        consumer.interrupt();

        producer.join();
        consumer.join();

    }

}
