package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class a1 {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<Object>();

        al.add(6);
        al.add(5);
        al.add(9);
        // Convert ArrayList to array

        Object[] ob = al.toArray();

        System.out.println(ob[1]);

        // // Convert ArrayList to String array

        // String[] ob1 =(String[]) al.toArray(); // typecast not possible
        // System.out.println(ob1);

        al.add(3, "mor");

        System.out.println(al);

        ArrayList<Integer> bb = new ArrayList<>();

        bb.add(6);
        bb.add(5);
        bb.add(9);

        Collections.sort(bb);
        System.out.println(bb);

        // to iterate

        bb.iterator();
        System.out.println(bb);

        Iterator<Integer> obo = bb.iterator();

        // iterate using while
        while (obo.hasNext()) { // Hasnext check If there any object anyMore
            System.out.println(obo.next()); // Next method uses for printing next object
        }

        ArrayList<String> aar = new ArrayList<>();
        aar.add("hola");
        aar.add("mola");
        aar.add("kola");

        ListIterator<String> itr = aar.listIterator();
        itr.next();
        itr.next();
        itr.next();

        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
    }
}
