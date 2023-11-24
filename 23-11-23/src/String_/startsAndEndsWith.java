package String_;

public class startsAndEndsWith {
    public static void main(String[] args) {
        String s= new String("Hello world");
        System.out.println(s.startsWith("s"));
        System.out.println(s.startsWith("H"));
        System.out.println(s.startsWith("l",3));
        System.out.println(s.endsWith("h"));
        System.out.println(s.endsWith("d"));
    }
}
