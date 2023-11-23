package String_;

public class indexOf_method {
    static String a= new String("Hello World");
    public static void main(String[] args) {
        System.out.println(a.indexOf(6));
        System.out.println(a.indexOf("W"));
        System.out.println(a.indexOf("o", 1));
        System.out.println(a.indexOf("o", 5));
    }
}
