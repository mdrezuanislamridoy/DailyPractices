package String_;

public class equals_in_java {
    public static void main(String[] args) {
        String a= "Hello";
        String b = "Hilo";
        String c= "Hello";
        String d= "hello";

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));
        System.out.println(a.equalsIgnoreCase(d));

        System.out.println();

        String s= new String("Hola");
        String p= new String("Vola");
        String o= s;

        System.out.println(s==p);
        System.out.println(s==o); // == operator compares object not the content of string
    }
}
