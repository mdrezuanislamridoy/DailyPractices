//Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a class named 'Rectangle' with a method named 'Area' which returns the area and length and breadth passed as parameters to its constructor.


package questions;

class Rectangle{
    double widt ,height;
    Rectangle(double widt,double height){
        this.widt= widt;
        this.height= height;
    }
    double area(){
        return widt*height;
    }
}
public class q5 {
    public static void main(String[] args) {
        Rectangle r= new  Rectangle(4, 5);
        System.out.println(r.area());

        Rectangle r1 = new Rectangle(5, 8);
        System.out.println(r1.area());
    }
}
