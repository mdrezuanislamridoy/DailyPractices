package String_;

public class s1 {
    public static void main(String[] args) {
        // String is an object . we use it by creating object .. string need "" double
        // quote to get string . string is a collection of character
        String str = new String("Hello world");

        System.out.println(str);

        // short cut to represent string.. easy to use
        String ssr = "Hello ssrr";
        System.out.println(ssr);


        System.out.println(str.isEmpty()); // to check string is empty or not
        System.out.println(ssr.isBlank()); // it is similler as is empty
    }
}
