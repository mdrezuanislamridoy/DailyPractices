//Implement a singly linked list in Java with basic operations (insert, delete, search).


package Questions;

import java.util.LinkedList;

public class Q1_LL {
    public static void main(String[] args) {
        LinkedList<Object> ls= new LinkedList<>();

        ls.add("kfjh");
        ls.add("fjala");
        ls.add(8785);

        ls.removeFirst();
        System.out.println(ls);
        System.out.println(ls.getFirst());
        System.out.println(ls.getLast());
        
    }
}
