//1. Write a Java program to create a base class Animal (Animal Family) with a method called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific sound for each animal.

package OOPs_Again.Polymorphism;

class Animal{
    void sound(){
        System.out.println("animal is sounding");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("cat is sounding");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog is sounding");
    }
}
public class q1 {
    public static void main(String[] args) {
        Animal a= new Animal();
        Animal b= new Cat();
        Animal c= new Dog();

        a.sound();
        b.sound();
        c.sound();
    }
}
