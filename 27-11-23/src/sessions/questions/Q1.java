//Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.

package sessions.questions;

public class Q1 {
    
    public static void main(String[] args) {
        int f= 11;
        ckNum(f);
        f=12;
        ckNum(f);
        
    }
    public static void ckNum(int n){
        try {
            IntCk(n);
            System.out.println(n+ " is even");
        } catch (Exception e) {
            System.out.println("exception is handled");
        }
    }

    public static void IntCk(int a){
        if (a%2!=0) {
            throw new IllegalArgumentException(a+" is odd");
        }
    }
}
