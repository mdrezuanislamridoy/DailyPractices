package String_;

public class trimMethod {
    public static void main(String[] args) {
        String a= "     Boss    ";
        System.out.println(a.length());
        System.out.println(a);

        String b = a.trim(); // trim use for remove before and after spaces
        System.out.println(b.length());
        System.out.println(b);
    }
}
