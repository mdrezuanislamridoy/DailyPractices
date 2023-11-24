package String_;

public class toCharArray {
    public static void main(String[] args) {
        String s= new String("Hello World");
        char[] a= s.toCharArray();
        for (char c : a) {
            System.out.println(c);
        }


        System.out.println();
        String b= "heoo";
        System.out.println(b.charAt(1));
    }
}
