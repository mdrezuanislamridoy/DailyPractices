package abstractions;

public abstract class A1 { // abstract can have abstract and non abstract methods

    // any types of data can store in abstract class 

    String he= "Men";
    int age = 11;

    public abstract void hola(); // abstract method dont have body

    public void ss(){
        System.out.println("hello world");
    }

    // abstraction can have any access modifiers in variable and methods

    private void a(){
        System.out.println("ammi");
    }
    // protected void b(){
    //     System.out.println("abbu");
    // }

}
