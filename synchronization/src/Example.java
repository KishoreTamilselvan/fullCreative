
class Institute{
    public synchronized void classRoom(String facName){  //Non-static synchronized menthod
        for (int i = 0; i < 10; i++) {
            System.out.println("Class is takeing by "+facName);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void examRoom(){  //non-static concrete method
        for (int i = 0; i < 10; i++) {
            System.out.println("Class is takeing by "+Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class MyThread extends Thread{
    Institute ins;
    String fac;
    @Override
    public void run() {
        ins.classRoom(fac);
    }
    MyThread(Institute ins,String fac){
        this.ins=ins;
        this.fac=fac;
    }
}
public class Example {
    public static void main(String[] args) {
        Institute ins=new Institute();
        MyThread t1=new MyThread(ins,"Thread-1");
        MyThread t2=new MyThread(ins,"Thread-2");
        t1.start();
        t2.start();
        ins.examRoom();
    }
}
