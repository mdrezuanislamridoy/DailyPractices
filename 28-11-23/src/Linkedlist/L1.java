package Linkedlist;

import java.util.LinkedList;

public class L1 {
    public static void main(String[] args) {
        LinkedList<Object> ls= new LinkedList<>();
        ls.add(45);
        ls.add("ha");

        System.out.println(ls);
        
        System.out.println(ls.removeFirst());
        System.out.println(ls.removeLast());

        ls.add(45);
        ls.add("ha");
        System.out.println(ls.getFirst());
        System.out.println(ls.getLast());
    }
}
