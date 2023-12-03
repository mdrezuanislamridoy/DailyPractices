package ExamPrep;

public class PrimeNum {
    public static void main(String[] args) {
        int n= 23;

        // int a= 1;

        // if (n==0||n==1) {
        //     System.out.println("Invalid");
        // }else{
        //     for (int i = 2; i < n/2; i++) {
        //         if (n%i==0) {
        //             System.out.println("not a prime");
        //             a=0;
        //             break;
        //         }
        //     }
        //     if (a==1) {
        //         System.out.println("is a prime number");
        //     }
        // }

        for (int i = 2; i <= n; i++) {
            int prime= 0;
            for (int j = 2; j <= i; j++) {
                if (i%j==0 && j!=i) {
                    prime= 1;
                }
            }
            if (prime==0) {
                System.out.print(i+" ");
            }
        }

    }
}
