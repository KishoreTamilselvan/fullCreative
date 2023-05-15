public class JoinMethod implements Runnable {
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
        //th1.start(); //It will throw IllegalThreadStateException once the thread is dead then we can't restart it again
        try {
            th1.join();//It will hold the remaining thread to complete the execution of current thread
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        th2.start();
        try {
            th2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        th3.start();
        try {
            th3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main method end");
    }
}
