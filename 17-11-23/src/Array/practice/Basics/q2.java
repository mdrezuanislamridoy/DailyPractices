// Write a Java program to sum values of an array.

package Array.practice.Basics;

public class q2 {
    public static void main(String[] args) {
        int ap[] = {34,3,2,7,4};

        int a= ap[0];
        for (int i = 1; i < ap.length; i++) {
            a= a+ap[i];
        }
        System.out.println(a);


        //------OR------

        int sum= 0;
        for (int i : ap) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
