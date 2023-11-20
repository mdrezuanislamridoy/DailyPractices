// second largest element in java

package Array.practice.DSA;

public class q2 {
    public static void main(String[] args) {
        
        int a[]= {1,2,3,4,6,5};

        int largest = a[0];
        for (int i = a.length-2; i > 0 ; i--) {
            if (a[i]!=largest) {
                largest= a[i];
                break;
            }
        }
        System.out.println(largest);
    }
}
 