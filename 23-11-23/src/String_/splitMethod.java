package String_;

public class splitMethod {
    public static void main(String[] args) {
        String a= "hello world";
        String b[] = a.split(" ");
        for (String string : b) {
            System.out.println(string);
        }
    }
}
