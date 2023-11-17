//2. Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.

package Abstraction.practice;

abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}
class Circle extends Shape{
    public double radius ;
    Circle(double radius){
        this.radius= radius;
    }
    @Override
    double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    double calculatePerimeter() {
        return 2*Math.PI*radius;
    }
    
}
class Triangle extends Shape{
    public double side1 ;
    public double side2;
    public double side3;
    Triangle(double side1,double side2,double side3){
        this.side1= side1;
        this.side2= side2;
        this.side3= side3;
    }
    @Override
    double calculateArea() {
        double s= (side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s*side2)*(s*side3));
    }

    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
    
}
public class q2 {
    public static void main(String[] args) {
        Triangle t= new Triangle(11, 12, 9);
        Circle c= new Circle(5);
        System.out.println(c.calculateArea());
        System.out.println(c.calculatePerimeter());
        System.out.println(t.calculateArea());
        System.out.println(t.calculatePerimeter());
    }
}
