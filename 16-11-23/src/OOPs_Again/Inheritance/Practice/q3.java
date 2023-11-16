//3. Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

package OOPs_Again.Inheritance.Practice;

class Shape{
    int getArea(){
        return 0;
    }
}
class Rectangle extends Shape{
    int w;
    int h; 
    Rectangle(int w, int h){
        this.w= w;
        this.h= h;
    }
    int getArea(){
        return w*h;
    }
}
public class q3 {
    public static void main(String[] args) {
        Rectangle r= new Rectangle(2, 4);
        System.out.println(r.getArea());
    }
}
