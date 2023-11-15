//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' with constructor having the three sides as its parameters.

package questions;

class Triangle{
    int a ,b,c;
    double s;
    Triangle(int a,int b,int c){
        this.a= a;
        this.b=b;
        this.c=c;
    }
    double Area(){
        s= (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    double perameter(){
        return (a+b+c)/2;
    }
}
public class q4 {
    public static void main(String[] args) {
        Triangle t = new Triangle(3, 4, 5);
        System.out.println(t.Area());
        System.out.println(t.perameter());
    }
}
