package ExamPrep;

public class PRa {
    
    public static void main(String[] args) {
        int n= 12;
        int prime = 0;
        for (int i = 2; i < n; i++) {
            
            if (n%i==0) {
                
                prime=1;

            }
            
        }
        if (prime==0) {
                System.out.println(n);
        }
        else{
            System.out.println("Not a prime");
        }
    }
}
