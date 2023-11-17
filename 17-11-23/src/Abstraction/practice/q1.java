//1. Write a Java program to create an abstract class Animal with an abstract method called sound(). Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a specific sound for each animal.

package Abstraction.practice;

abstract class Animal{
    abstract void sound();
}
class Lion extends Animal{

    @Override
    void sound() {
        
        System.out.println("Lion is roaring");
    }
    
}
class Tiger extends Animal{

    @Override
    void sound() {
        
        System.out.println("Tiger is roaring");
    }
    
}
public class q1 {
    public static void main(String[] args) {
        Lion a= new Lion();
        Tiger b= new Tiger();

        a.sound();
        b.sound();
    }
}
