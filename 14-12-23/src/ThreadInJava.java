public class ThreadInJava {
    public static void main(String[] args) {
        A a= new A();
        B b= new B();

        a.start();
        b.start();
    }

}

class A extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Good");
        }
    }
}
class B extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Night");
        }
    }
}
