//3. Write a Java program to create a class called Rectangle with private instance variables length and width. Provide public getter and setter methods to access and modify these variables.

package Encapsulation.Practice;

class Rectangle{
    private int length;
    private int width;

    

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    
    public double calculateArea(){
        return length*width;
    }
}
public class q3 {
    public static void main(String[] args) {
        Rectangle r= new Rectangle();
        r.setLength(345);
        r.setWidth(234);
        System.out.println(r.calculateArea());
    }
}
