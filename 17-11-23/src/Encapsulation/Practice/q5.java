//5. Write a Java program to create a class called Circle with a private instance variable radius. Provide public getter and setter methods to access and modify the radius variable. However, provide two methods called calculateArea() and calculatePerimeter() that return the calculated area and perimeter based on the current radius value.

package Encapsulation.Practice;

class Circle{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    double calculateArea(){
        return Math.PI*radius*radius;
    }
    double calculatePerimeter(){
        return 2*Math.PI*radius;
    }
}
public class q5 {
    public static void main(String[] args) {
        Circle c= new Circle();
        c.setRadius(5);

        System.out.println(c.calculateArea());
        System.out.println(c.calculatePerimeter());
    }
}
