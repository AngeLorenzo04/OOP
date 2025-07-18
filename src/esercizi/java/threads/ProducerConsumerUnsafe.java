package threads;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.random.RandomGenerator;

public class ProducerConsumerUnsafe {
    static int pushedItem = 0;
    static int fetchedItem = 0;
    static RandomGenerator rd = RandomGenerator.getDefault();


    public static class producer extends Thread {

        final LinkedBlockingQueue<Integer> queue;
        public producer(String name, LinkedBlockingQueue<Integer> queue){
            super(name);
            this.queue = queue;
        }

        @Override
        public void run(){
            while (!isInterrupted()){
                int Item = rd.nextInt(10);
                try {
                    queue.put(Item);
                } catch (InterruptedException ignore) {}
                pushedItem++;
            }
        }


    }

    public static class consumer extends Thread {

        final LinkedBlockingQueue<Integer> queue;
        public consumer(String name, LinkedBlockingQueue<Integer> queue){
            super(name);
            this.queue = queue;
        }

        @Override
        public void run(){
            while (!isInterrupted()){
                int Item = queue.remove();
                fetchedItem++;
               System.out.println("indice fetch: " + fetchedItem + " Elemento fetchato: " + Item);
            }
            System.out.println("Elementi fetchati: " + fetchedItem);
        }


    }


    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        producer producer = new producer("p",queue);
        consumer consumer = new consumer("c" , queue);

        producer.start();
        consumer.start();

        Thread.sleep(100L);

        producer.interrupt();
        consumer.interrupt();

        producer.join();
        consumer.join();

    }

}
