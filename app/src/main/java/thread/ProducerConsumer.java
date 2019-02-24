package thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerConsumer {

    public static void main(String[] args) {


        BlockingQueue<Integer> sharedQ = new LinkedBlockingDeque<>();

        Producer p = new Producer(sharedQ);
        Consumer c = new Consumer(sharedQ);

        p.start();
        c.start();
    }
}

class Producer extends Thread{

    private BlockingQueue<Integer> queue;
    public Producer(BlockingQueue<Integer> sharedQ) {
        super();
        queue = sharedQ;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(i+""+queue.getClass().getSimpleName());
            try {
                queue.put(i);
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread{

    private BlockingQueue<Integer> queue;
    public Consumer(BlockingQueue<Integer> sharedQ) {
        super();
        queue = sharedQ;
    }

    @Override
    public void run() {
        while(true){
            try {
                Integer take = queue.take();
                System.out.println(take+""+queue.getClass().getSimpleName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
