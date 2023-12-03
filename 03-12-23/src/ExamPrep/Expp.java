package ExamPrep;

public class Expp {
    public static void main(String[] args) {
        int n=10,a =0,b=1;
        System.out.println(a);
        System.out.println(b);
       
        for (int j = 0; j < n; j++) {
            
            int temp= a+b;
            System.out.println(temp);
            a= b;
            b=temp;
            
        }
    }
}
