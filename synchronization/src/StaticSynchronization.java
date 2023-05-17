class Display{
    public static synchronized void wish(String name) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Good Morning: ");
            System.out.println(name);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
    public synchronized void method1(){
        System.out.println("Non static synchronized method1 executing");
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Non static method1 execution is completed");
    }
    public synchronized void method2(){
        System.out.println("Non static synchronized method2 executing");
//        try {
//            wait();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("Non static method2 execution is completed");
        notify();
    }
//    public synchronized void method3(){
//        System.out.println("Non static synchronized method3 executing");
//        System.out.println("Non static method3 execution is completed");
//        notify();
//    }
}
class ChildThread extends Thread{
    Display d;
    String name;
    ChildThread(Display d,String name){
        this.d=d;
        this.name=name;
    }
    @Override
    public void run() {
        d.wish(name);
    }
}


public class StaticSynchronization {
    public static void main(String[] args) {
        Display d1=new Display();
       //Display d2=new Display();
        ChildThread t1=new ChildThread(d1,"Dhoni");
        ChildThread t2=new ChildThread(d1,"Yuvaraj");
        t1.start();
        t2.start();
        new Thread(){
            @Override
            public void run() {
                d1.method1();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                d1.method2();
            }
        }.start();
//        new Thread(){
//            @Override
//            public void run() {
//                d1.method3();
//            }
//        }.start();
    }
}
