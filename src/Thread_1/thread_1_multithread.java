package Thread_1;
class NumberPrinter implements Runnable     {
    private String name;
    private int maxNumber;
    public NumberPrinter(String name, int maxNumber){
        this.name=name;
        this.maxNumber=maxNumber;
    }

    @Override
    public void run() {
        for(int i=1;i<=maxNumber;i++){
            System.out.println(name+" Prints "+i);
        }
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            System.out.println(name+" was Interrupted");
        }
    }
}
public class thread_1_multithread {
    public static void main(String[] args) throws Exception{
        NumberPrinter printer_1 = new NumberPrinter("Thread_1", 5);
        NumberPrinter printer_2 = new NumberPrinter("Thread_2",5);
        Thread thread = new Thread(printer_1);
        Thread thread1 = new Thread(printer_2);
        thread.start();
        thread1.start();
        thread1.join();
        thread.join();
    }
}
