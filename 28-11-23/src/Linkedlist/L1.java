package Linkedlist;

import java.util.LinkedList;

public class L1 {
    public static void main(String[] args) {
        LinkedList<Object> ls= new LinkedList<>();
        ls.add(45);
        ls.add("ha");
        
        // Object oo= ls;
        // ls.add(5);
        // System.out.println(oo);

        // System.out.println(ls);
        
        // System.out.println(ls.removeFirst());
        // System.out.println(ls.removeLast());

        // ls.add(45);
        // ls.add("ha");
        // System.out.println(ls.getFirst());
        // System.out.println(ls.getLast());


        LinkedList ll= new LinkedList<>();

        ll.add(44);
        ll.add(534);

        Object oob= ls;
        Object obi= ll;
        System.out.println(oob);
        System.out.println(obi);
    }
}
