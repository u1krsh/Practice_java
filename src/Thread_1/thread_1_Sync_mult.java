package Thread_1;

class Counter {
    int count;
    public synchronized void increment() {
        count++;
    }
}

class Incrementer implements Runnable {
    Counter c;
    public Incrementer(Counter c) {
        this.c = c;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            c.increment();
        }
    }
}

public class thread_1_Sync_mult {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();

        Incrementer inc = new Incrementer(c);

        Thread t1 = new Thread(inc);
        Thread t2 = new Thread(inc);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count: " + c.count);
    }
}
