class Car {
// this() in overloading constructor
    Car(){
        System.out.println("Hello");
    }

    Car(int a){
        this();
        System.out.println(a);
    }
    Car(int a,int b){
        this(5);
        System.out.println(a+" "+b);
    }
}

public class constr {
    public static void main(String[] args) {
        Car car= new Car(4,6);
    }
}
