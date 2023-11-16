package OOPs_Again.inner_class;

class A {
    void pr(){
        System.out.println("showing ");
    }

    class B{
        void show(){
            System.out.println("in b show");
        }
    }
}
public class ic {
    public static void main(String[] args) {
        // B b= new B(); .......... this wont work in inner class
        //A.B ibb = new A.B(); .......... this still wont works

        A  a = new A();
        A.B ob= a.new B();
        
        ob.show();
    }
}
