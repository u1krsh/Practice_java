package Thread_1;

class trds extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
}
public class thread_1_Thread {
    public static void main(String[] args) {
        trds MyThread = new trds();
        MyThread.start();
    }
}
