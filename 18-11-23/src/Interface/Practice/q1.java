//1. Write a Java program to create an interface Shape with the getArea() method. Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. Implement the getArea() method for each of the three classes.

package Interface.Practice;

interface Shape {
    double getArea();
}

class Rectangle implements Shape {

    int height, width;

    Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

}

class Circle implements Shape {

    int radius;

    Circle(int radius) {
        this.radius = radius;

    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

}

class Triangle implements Shape {

    int height, base;

    Triangle(int height, int base) {
        this.height = height;
        this.base = base;

    }

    @Override
    public double getArea() {
        return 0.5*base*height;
    }

}

public class q1 {
    public static void main(String[] args) {
        Shape r,t,c;

        r= new Rectangle(2, 3);
        t= new Triangle(2, 3);
        c= new Circle(3);
        System.out.println(r.getArea());
        System.out.println(t.getArea());
        System.out.println(c.getArea());
    }
}
