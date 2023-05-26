public class DeadLock {
    public static void main(String[] args) {
        String resource1 = "Printer";
        String resource2 = "Scanner";

        Runnable run1 = () -> {

            synchronized (resource1) {

                System.out.println(Thread.currentThread().getName() + " Locked: " + resource1);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }
            synchronized (resource2) {

                System.out.println(Thread.currentThread().getName() + " Locked: " + resource2);

            }
        };

        Runnable run2 = () -> {

            synchronized (resource2) {

                System.out.println(Thread.currentThread().getName() + " Locked: " + resource2);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }

            synchronized (resource1) {

                System.out.println(Thread.currentThread().getName() + " Locked: " + resource1);

            }
        };

        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);
        t1.setName("Desktop");
        t2.setName("Laptop");

        t1.start();
        t2.start();
    }
}
