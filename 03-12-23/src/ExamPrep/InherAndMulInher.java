package ExamPrep;

class H1 {

    public static void a(){
        System.out.println("Hello World");
    }
}
class H2 extends H1{
    public static void b(){
        System.out.println("Gelo Woeld");
    }
}
class H3 extends H2{
    public static void c(){
        System.out.println("Good night");
    }
}

public class InherAndMulInher {
    public static void main(String[] args) {
        H3 h3= new H3();
        h3.a();
        h3.b();
        h3.c();
    }
}
