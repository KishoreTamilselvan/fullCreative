public class ThreadExample extends Thread { //Or implements Runnable Interface
    @Override
    public void run() {
        System.out.println(currentThread().getName());
        System.out.println("Hi this is "+currentThread().getName());// To get the thread name
        try {
            Thread.sleep(1000);// It'll through a InterruptedException
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("My priority is "+currentThread().getPriority());// To get the priority of current thread
    }

    public static void main(String[] args) {
        ThreadExample t1=new ThreadExample();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Execution of the main thread");
    }
}
