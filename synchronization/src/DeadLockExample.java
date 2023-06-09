public class DeadLockExample {
    public static void main(String[] args) {
        final String resource1 = "ratan jaiswal";
        final String resource2 = "vimal jaiswal";
        // t1 tries to lock resource1 then resource2
        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {// It will lock the resource 1
                    System.out.println("Thread 1: locked resource 1");

                    synchronized (resource2) {
                        System.out.println("Thread 1: locked resource 2");
                    }
                }
            }
        };
        // t2 tries to lock resource2 then resource1
        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {// It will lock the resource 2
                    System.out.println("Thread 2: locked resource 2");

                    synchronized (resource1) {
                        System.out.println("Thread 2: locked resource 1");
                    }
                }
            }
        };
        t1.start();
        t2.start();
        //To avoid this deadlock we can use join method
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}
