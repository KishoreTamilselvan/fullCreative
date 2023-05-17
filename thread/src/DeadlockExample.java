
class Resource {
    public synchronized void methodA(Resource otherResource) {
        System.out.println("Thread A: Acquiring lock on otherResource...");
        otherResource.methodB(this);
        System.out.println("Thread A: Released lock on otherResource");
    }

    public synchronized void methodB(Resource otherResource) {
        System.out.println("Thread B: Acquiring lock on otherResource...");
        otherResource.methodA(this);
        System.out.println("Thread B: Released lock on otherResource");
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        final Resource resource1 = new Resource();
        final Resource resource2 = new Resource();

        Thread threadA = new Thread(){
            @Override
            public void run() {
                resource1.methodA(resource2);
            }
        };
        Thread threadB = new Thread(){
            @Override
            public void run() {
                resource2.methodB(resource1);
            }
        };

        threadA.start();
        threadB.start();
    }
}
