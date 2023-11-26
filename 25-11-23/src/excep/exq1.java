//Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.

package excep;

public class exq1 {
    public static void main(String[] args) {
        int n= 3;
        mm(n);
    }
    public static void mm(int n){
        try {
            ev(n);
            System.out.println(n+" is even");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void ev(int b){
        if (b%2!=0) {
            throw new IllegalArgumentException(b+ " is odd");
        }
    }
}
