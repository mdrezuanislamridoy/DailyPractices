package String_;

public class lengthInJava {
    public static void main(String[] args) {
        String l= new String("Hola");
        String ll= new String("Hola vola"); // space also count in length
        System.out.println(l.length());
        System.out.println(ll.length());// length() method uses for String length


        String[] lll={"hola","vola"};
        System.out.println(lll.length); // length uses for array length
    }
}
