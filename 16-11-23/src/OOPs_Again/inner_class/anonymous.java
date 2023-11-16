package OOPs_Again.inner_class;

class Aa{
    void rr(){
        System.out.println("hello");
    }

    public void show() {
        System.out.println("in a show");
    }
}
public class anonymous {
    public static void main(String[] args) {
        Aa aa= new Aa(){
            public void show(){
                System.out.println("in b show");
            }
        };
        aa.show();
        aa.rr();
    }
}
