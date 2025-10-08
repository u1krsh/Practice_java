package Thread_1;
class trds_2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable thread runnning");
    }
}
public class thread_1_Runnable {
    public static void main(String[] args){
        trds_2 MyThread = new trds_2();
        Thread thread = new Thread(MyThread);
        thread.start();
    }
}
