class RunningThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is running "+currentThread().getName());
    }
}
class ThreadPriority{
    public static void main(String[] args) {
        Thread t1=new RunningThread();
        Thread t2=new RunningThread();
        Thread t3=new RunningThread();
        t1.setPriority(6);
        t2.setPriority(8);
        t3.setPriority(2);
        t1.setName("Audio");
        t2.setName("Video");
        t3.setName("Timer");
        t1.start();
        t2.start();
        t3.start();
        //Getting the priority of thread
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

        //After setting priority
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

        //Getting the thread ID
        System.out.println(t1.getId());
        System.out.println(t2.getId());
        System.out.println(t3.getId());

    }
}