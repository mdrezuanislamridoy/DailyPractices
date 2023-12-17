/*

public class ThreadInJava {
    public static void main(String[] args) {
        A a= new A();
        B b= new B();

        System.out.println(a.getPriority());

        a.setPriority(Thread.MAX_PRIORITY);
        System.out.println(a);

        
        a.start();
        b.start();
    }

}

class A extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Good");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                
                System.out.println(e.getMessage());
            }
        }

    }
}
class B extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Night");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                
                System.out.println(e.getMessage());
            }
        }
    }
}

*/


//Runable interface alternative of thread..... it is an interface

class Counter{
    int count;
    public synchronized void increment(){ // syncronised works for work 1 thread at a time
        count++;
    }
}
public class ThreadInJava{
    public static void main(String[] args) throws InterruptedException {
 /*
        Runnable r= () ->
            {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hello");
                    try {Thread.sleep(100); } catch (Exception e) {e.printStackTrace();}
                }
            };
        Runnable r2= () ->
            {
                for (int i = 0; i < 10; i++) {
                    System.out.println("hi");
                    try {Thread.sleep(100); } catch (Exception e) {e.printStackTrace();}
                }
            };

        Thread t= new Thread(r);
        Thread t2= new Thread(r2);
        
        t.start();
        try {Thread.sleep(10); } catch (Exception e) {e.printStackTrace();}
        t2.start();

        t.join();
        t2.join();

        System.out.println("hello world");


*/
        // Counter c= new Counter();
        // Runnable r = ()->{
        //     for (int i = 0; i < 1000; i++) {
        //         c.increment();
        //     }
        // };
        // Runnable r1 = ()->{
        //     for (int i = 0; i < 1000; i++) {
        //         c.increment();
        //     }
        // };

        // Thread t1= new Thread(r);
        // Thread t2= new Thread(r1);

        // t1.start();
        // t2.start();

        // t1.join();
        // t2.join();

        // System.out.println(c.count);


        Counter c= new Counter();
        Runnable r = ()->{
            for (int i = 0; i < 10; i++) {
                c.increment();
            }
        };
        Runnable r1 = ()->{
            for (int i = 0; i < 10; i++) {
                c.increment();
            }
        };

    }
}











