//2. Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car".

package OOPs_Again.Inheritance.Practice;


class Vehicle{
    void drive(){
        System.out.println("Driving car");
    }
}
class Car{
    void drive(){
        System.out.println("Repairing a car");
    }
}
public class q2 {
    public static void main(String[] args) {
        Car car= new Car();
        car.drive();
    }
}
