package excep;

public class ex {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println("exception is " + e);
        }
        System.out.println();

        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("exception is " + e);
        }
        System.out.println();

        try {
            int a = 10 / 0;
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("exception is " + a);
        } catch (ArithmeticException e) {
            System.out.println("exception is " + e);
        } finally {
            System.out.println("Exception Handled");
        }

        System.out.println();

        try {
            int a = 10 / 0;
        } catch (Exception a) {
            System.out.println("exception is " + a.getMessage());
            a.printStackTrace();
        }


    }
}
