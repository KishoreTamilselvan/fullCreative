public class YieldMethod implements Runnable{
    public void run()
    {
        System.out.println(Thread.currentThread()+"Start");
        Thread.yield(); // Calling yield() method on current thread to move back into the runnable state from running state.

        System.out.println(Thread.currentThread()+"End");
    }
    public static void main(String[] args)
    {
        YieldMethod a1 = new YieldMethod();
        Thread t1 = new Thread(a1, "First Child Thread");

        YieldMethod a2 = new YieldMethod();
        Thread t2 = new Thread(a2, "Second Child Thread");

        t1.start();
        t2.start();
    }
}
