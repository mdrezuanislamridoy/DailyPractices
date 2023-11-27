package CollectionsFrameWork.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class L1 {
    public static void main(String[] args) {

        // ArrayList

        // ArrayList is a sub class of List interface which is belongs to collection
        // interface

        // List l= new ArrayList<>();
        // l.add(2);
        // l.add(5);
        // System.out.println(l);

        ArrayList a = new ArrayList<>();

        a.add("RRR"); // .add is a method to add value in array list
        a.add(66); // any data type is allowed in List

        Object obj = a.get(0); // .get use to retrive or get any object from any list .. object is a random
                               // local variable

        System.out.println(obj);
        System.out.println(a);

        System.out.println(a.size()); // .size to show size of ArrayList

        // itarate value from array list
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }

        // For Each : only uses for arrays and collection

        for (Object tm : a) {
            System.out.println(tm);
        }

        // array list can add duplicate value

        a.add("RRR");

        System.out.println(a);

        a.remove(1);
        System.out.println(a);

        // Array is fixed in size......... ArrayList is resizeable

        int[] d = new int[3];
        d[0] = 1;
        d[1] = 3;
        d[2] = 5;

        for (int i : d) {
            System.out.println(i);
        }

        ArrayList c = new ArrayList<>();

        c.add(2);
        c.add(5);
        c.add("Ridoy");

        System.out.println(c);
        c.add(5);
        System.out.println(c);
        c.remove(1);
        System.out.println(c);

        // array only can add different type of value by Object class
        // array list can store any type of value

        Object[] o = { 4, 6, 7, 8, 3.9, "he" };
        for (Object object : o) {
            System.out.println(object);
        }

        // In array list

        c.add(2);
        c.add(5.5);
        c.add("Ridoy");

        System.out.println(c);

        // we can fixed array list type

        ArrayList<String> as = new ArrayList<String>();

        as.add("Boll");
        as.add("Cou");
        as.add("Lov");

        System.out.println(as);

        ArrayList<Object> dd = new ArrayList<Object>(); // use Object type generics for removing yellow error

        dd.add(88);
        dd.add("RRR");
        dd.add('a');

        System.out.println(dd);

        System.out.println(dd.isEmpty());

        System.out.println(dd.contains(88));

        // Array can have primitive data type and Wrapper class

        Integer[] i = { 4, 5, 6, 7, 7 };
        for (Integer integer : i) {
            System.out.println(integer);
        }
    }
}
