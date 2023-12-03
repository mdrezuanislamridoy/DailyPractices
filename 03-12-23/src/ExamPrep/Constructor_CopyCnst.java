package ExamPrep;

class Car {

    String name ;
    int wheel;

    //Constructor
    public Car(String name,int wheel){
        this.name= name;
        this.wheel= wheel;
    }
    //copy Constructor
    public Car(Car c){
        this.name= c.name;
        this.wheel= c.wheel;
    }
}
public class Constructor_CopyCnst {
    public static void main(String[] args) {
        Car cc= new Car("Rolls Royes", 123); // Constructor Define
        Car cs= new Car(cc); // Copy Constructor define

        System.out.println(cc.name+ " "+ cc.wheel);
        System.out.println(cs.name+ " "+ cs.wheel);
    }
}
