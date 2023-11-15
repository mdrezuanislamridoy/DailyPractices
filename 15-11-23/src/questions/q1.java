//Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.

package questions;

class Area {
    double wid,heig;
    void setDim(double wid,double heig) {
        this.wid= wid;
        this.heig= heig;
    }
    double getArea(){
        return wid*heig;
    }
}

public class q1 {
    public static void main(String[] args) {
        Area area= new Area();
        area.setDim(4, 6);
        double d= area.getArea();
        System.out.println(d);
    }
}
