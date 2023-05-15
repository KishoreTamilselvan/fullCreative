public class ThreadRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running I am "+Thread.currentThread().getName()+ " My Priority is "+Thread.currentThread().getPriority());
        Thread.yield();
        System.out.println("After the Yield method "+Thread.currentThread().getName());

    }

    public static void main(String[] args) {
        ThreadRunnable t1=new ThreadRunnable();
        Thread th1=new Thread(t1, "AudioThread");
        Thread th2=new Thread(t1, "VideoThread");
        Thread th3=new Thread(t1, "TimerThread");

        th1.start();
        th2.start();
        th3.start();

    }
}
