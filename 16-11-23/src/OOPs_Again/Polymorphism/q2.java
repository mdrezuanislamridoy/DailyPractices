//2. Write a Java program to create a class Vehicle with a method called speedUp(). Create two subclasses Car and Bicycle. Override the speedUp() method in each subclass to increase the vehicle's speed differently.

package OOPs_Again.Polymorphism;

class Vehicle{
    int speed= 0;
    int speedUp(){
        return speed;
    }
}
class Car extends Vehicle{
    int speed= 0;
    int speedUp(){
        return speed+10;
    }
}
class Bicycle extends Vehicle{
    int speed= 0;
    int speedUp(){
        return speed+5;
    }
}
public class q2 {
    public static void main(String[] args) {
        Vehicle v= new Vehicle();
        Vehicle c= new Car();
        Vehicle b= new Bicycle();

        System.out.println(v.speedUp());
        System.out.println(c.speedUp());
        System.out.println(b.speedUp());
    }
}
