package String_Buffer;

public class sb1 {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("Hello World"); // to declare string buffer.
        //StringBuffer sb= "hello"; // this is not possible
        System.out.println(sb);

        StringBuffer rr = sb.append(" Good Night"); // add text after sb text

        System.out.println(rr);

        System.out.println(sb.insert(5, " hello"));

        System.out.println(sb.delete(5, 11));

        System.out.println(sb.deleteCharAt(7));


        System.out.println(sb.replace(6, 10, "Bolod"));

        sb.setCharAt(3, 'r');
        System.out.println(sb);

        sb.setLength(11);

        System.out.println(sb);
        
        System.out.println(sb.toString());

        System.out.println(sb.reverse());
    }
}
