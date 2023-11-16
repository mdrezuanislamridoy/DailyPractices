//1. Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to meaw.

package OOPs_Again.Inheritance.Practice;

class Animal{
    void makeSound(){
        System.out.println("Making Sound ");
    }
}
class Cat{
    void makeSound(){
        System.out.println("meaw");
    }
}
public class q1 {
    public static void main(String[] args) {
        Cat c= new Cat();
        c.makeSound();
    }
}
