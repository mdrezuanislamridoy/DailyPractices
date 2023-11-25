package constr;

public class const1 {

    const1(){
        System.out.println("hello world");
    }

    const1(int a){
        System.out.println(a+" is the value");
    }






// object og current class
    void hola(){
        hello(this);
    }
    void hello(const1 obj){
        System.out.println("Good NIght");
    }
}