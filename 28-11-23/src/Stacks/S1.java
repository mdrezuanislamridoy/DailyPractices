package Stacks;

import java.util.Stack;

public class S1 {
    public static void main(String[] args) {
        Stack<Object> h= new Stack<>();
        h.push("Joly"); // push to add values
        h.push("moly");
        h.push("hoomj");
        h.push(665);
        h.push(true);

        System.out.println(h);

        System.out.println(h.pop()); // pop will get last element and remove it
        System.out.println(h);
        System.out.println(h.peek()); // peed get last element but dont remove
        
        System.out.println(h.empty()); // if empty

        System.out.println(h.search("hoomj")); // to get any object index from array
        System.out.println(h.search("hoom")); // if not available -1 will show
    }
}
