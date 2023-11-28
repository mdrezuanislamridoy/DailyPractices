//Iterating over an ArrayList

package Arraylist.Questions;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.ListIterator;

public class a5 {
    public static void main(String[] args) {
        ArrayList<String> sr = new ArrayList<>();
        sr.add("Dhi");
        sr.add("MOr");
        sr.add("kita");

        for (int i = 0; i < sr.size(); i++) {
            System.out.println(sr.get(i));
        }
        System.out.println();
        for (String string : sr) {
            System.out.println(string);
        }
        System.out.println();
        Iterator<String> rrr = sr.iterator();
        while (rrr.hasNext()) {
            System.out.println(rrr.next());
        }

        ListIterator<String> li= sr.listIterator();

        while (li.hasNext()) {
            System.out.println(li.next());
        }
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}
