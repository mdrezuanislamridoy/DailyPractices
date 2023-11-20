// Write a Java program to print the following grid.
//  0  0  0  0  0  0  0  0  0  0 
//  0  0  0  0  0  0  0  0  0  0 
//  0  0  0  0  0  0  0  0  0  0 
//  0  0  0  0  0  0  0  0  0  0 
//  0  0  0  0  0  0  0  0  0  0 
//  0  0  0  0  0  0  0  0  0  0 
//  0  0  0  0  0  0  0  0  0  0 
//  0  0  0  0  0  0  0  0  0  0 
//  0  0  0  0  0  0  0  0  0  0 
//  0  0  0  0  0  0  0  0  0  0 

package Array.practice.Basics;

public class q3 {
    public static void main(String[] args) {
        int[][] a = new int[10][10];    
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                System.out.print(" "+ a[i][j]);
            }
            System.out.println();
        }
    }
}
