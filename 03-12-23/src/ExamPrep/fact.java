package ExamPrep;

public class fact {

    public static int Fac(int n) {
        if (n <= 0) {
            return 1;
        }
        return n * Fac(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is " + Fac(n));

    }
}
